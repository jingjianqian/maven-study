package com.ucap.ms.approve.api.vo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ucap.ms.approve.config.ConfigClientController;
import com.ucap.ms.base.enums.CacheCodeEnum;
import com.ucap.ms.cache.util.CommonCacheUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Component
public class ApproveAuditItemApi {

    private static Logger log = LoggerFactory.getLogger(ApproveAuditItemApi.class);


    @Resource
    private ConfigClientController configClientController;


    @Resource
    ApproveAuditItemsSourceApi approveAuditItemsSourceApi;


    @Resource
    RestTemplate restTemplate;

    @Resource
    private CommonCacheUtil commonCacheUtil;

    /**
     * 获取accessToken
     * @return
     * @param refreshToken
     */
    public String getAccessToken(Boolean refreshToken){
        try {
            if(!Boolean.TRUE.equals(refreshToken)){
                String accessToken  = (String) commonCacheUtil.getCache(CacheCodeEnum.INNERWEB.getValue()).get(configClientController.getKEY_AUDIT_ITEM_API_TOKEN());
                if(accessToken !=null){
                    return accessToken;
                }
            }
//            Map<String, Object> map = requestParamsDept(accessToken, deptCode, timestamp);
//            //String accessToken  = (String) CommonCacheUtil.getCache(CacheCodeEnum.INNERWEB.getValue()).get(KEY_AUDIT_ITEM_API_TOKEN);
//            MultiValueMap<String, Object> postParameters = new LinkedMultiValueMap<>();
//            postParameters.add(GRANT_TYPE, GRANT_TYPE_VALUE);
//            postParameters.add(CLIENT_ID, CLIENT_ID_VALUE);
//            postParameters.add(CLIENT_SECRET, CLIENT_SECRET_VALUE);
//
//            RequestEntity<Map<String, Object>> requestEntity = RequestEntity.post(new URL(configClientController.getGET_DEPTAUDITITEM_URL()).toURI())
//                    .contentType(MediaType.APPLICATION_JSON_UTF8)
//                    .accept(MediaType.APPLICATION_JSON_UTF8)
//                    .body(map);
//
//            ResponseEntity<String> exchange = restTemplate.exchange(requestEntity, String.class);

            return configClientController.toString();




        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return "{'status':'11111'}";
        }
    }



    public JSONObject getAuditItemsLimit(String deptCode){
        JSONObject returnJson = approveAuditItemsSourceApi.getAuditItemsDeptLimit(deptCode,0L);
        if(returnJson == null){
            return null;
        }
        JSONObject data = returnJson.getJSONObject("data");
        if(data == null){
            return returnJson;
        }
        Long num = data.getLong("RETURNITEMSUNNUM");
        Long timestamp = data.getLong("LASTTIMESTAMP");
        Long timestampRe = 0L;
        JSONObject jsonRe =null;
        JSONArray list = data.getJSONArray("list");
        if(timestamp == null || list == null) {
            return returnJson;
        }
        int resultSize = list.size();
        log.info("getAuditItemsDeptLimit-deptCode:" + deptCode
                + ",timestamp:" + timestamp + ",num:" + num);
        while (resultSize == 100 && !timestamp.equals(timestampRe)) {
            log.info("getAuditItemsDeptLimit-deptCode:" + deptCode + ",timestamp:" + timestamp + ",timestampRe:" + timestampRe);
            timestamp = timestampRe;
            if(timestamp!=0) {
                jsonRe = approveAuditItemsSourceApi.getAuditItemsDeptLimit(deptCode, timestamp);
            }else{
                jsonRe = approveAuditItemsSourceApi.getAuditItemsDeptLimit(deptCode, data.getLong("LASTTIMESTAMP"));
            }
            if(timestamp!=0) {
                jsonRe = approveAuditItemsSourceApi.getAuditItemsDeptLimit(deptCode, timestamp);
            }else{
                jsonRe = approveAuditItemsSourceApi.getAuditItemsDeptLimit(deptCode, data.getLong("LASTTIMESTAMP"));
            }
            if(jsonRe == null) {
                log.warn("getAuditItemsDeptLimit-deptCode:" + deptCode + ",jsonRe is null");
                break;
            }
            JSONObject dataRe = jsonRe.getJSONObject("data");
            if(dataRe == null){
                log.warn("getAuditItemsDeptLimit-deptCode:" + deptCode + ",dataRe is null");
                break;
            }
            Long numRe = dataRe.getLong("RETURNITEMSUNNUM");
            timestampRe = dataRe.getLong("LASTTIMESTAMP");
            JSONArray listRe = dataRe.getJSONArray("list");
            if(timestampRe == null || listRe == null) {
                log.warn("getAuditItemsDeptLimit-deptCode:" + deptCode + ",timestampRe:" + timestampRe + " or listRe is null");
                break;
            }

            log.info("getAuditItemsDeptLimit-deptCode:" + deptCode + ",num:" + num + ",numRe:" + numRe);

            num += numRe;
            resultSize = listRe.size();
            //这个部分要优化 不知道是那个智障写的
            list.addAll(listRe);
        }
        data.put("RETURNITEMSUNNUM", num);

        return  returnJson;
    }








}
