package com.ucap.ms.approve.api.vo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ucap.ms.approve.api.payload.RequestAuditItemPayload;
import com.ucap.ms.approve.api.payload.RequestTaskItemPayload;
import com.ucap.ms.approve.config.ConfigClientController;
import com.ucap.ms.approve.controller.ApproveStemItemController;
import com.ucap.ms.approve.exception.RequestInferfaceException;
import com.ucap.ms.base.enums.CacheCodeEnum;
import com.ucap.ms.cache.util.CommonCacheUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpClientErrorException;


import javax.annotation.Resource;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Component
public class ApproveAuditItemApi {

    private static Logger log = LoggerFactory.getLogger(ApproveAuditItemApi.class);


    @Resource
    ApproveAuditItemsSourceApi approveAuditItemsSourceApi;

    @Resource
    ConfigClientController configClientController;



    private static final Logger logger = LoggerFactory.getLogger(ApproveAuditItemApi.class);



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
        JSONObject jsonRe =null;
        JSONArray list = data.getJSONArray("list");
        if(timestamp == null || list == null) {
            return returnJson;
        }
        log.info("getAuditItemsDeptLimit-deptCode:" + deptCode + ",timestamp:" + timestamp + ",num:" + num);


        int status_code = returnJson.getJSONObject("STATUS").getInteger("CODE");
        while(status_code == 0){
            jsonRe = approveAuditItemsSourceApi.getAuditItemsDeptLimit(deptCode, timestamp);

            timestamp = jsonRe.getJSONObject("data").getLong("LASTTIMESTAMP");
            logger.info(String.valueOf(timestamp));
            status_code = jsonRe.getJSONObject("STATUS").getInteger("CODE");
            if(status_code != 0){
                break;
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

            JSONArray listRe = dataRe.getJSONArray("list");


            log.info("getAuditItemsDeptLimit-deptCode:" + deptCode + ",num:" + num + ",numRe:" + numRe);

            num += numRe;
            list.addAll(listRe);
        }

        data.put("RETURNITEMSUNNUM", num);

        return  returnJson;
    }



    /**
     * 获取事项列表（含业务办理项编码条件过滤）
     * @return
     */
    public RequestAuditItemPayload getAuditItemsByYwcode(String itemCode, String ywcode) {
//        try {
//            String accessToken = approveAuditItemsSourceApi.getAccessToken(null);
//            if(accessToken == null){
//                throw new RequestInferfaceException("获取 access token 失败");
//            }
//            Map<String, Object> map = requestParams(accessToken, itemCode);
//            RequestEntity<Map<String, Object>> requestEntity = RequestEntity.post(new URL(configClientController.getGET_DEPTAUDITITEM_URL()/**GET_AREAAUDITITEM_URL***/).toURI())
//                    .contentType(MediaType.APPLICATION_JSON_UTF8)
//                    .accept(MediaType.APPLICATION_JSON_UTF8)
//                    .body(map);
//            ResponseEntity<String> exchange = restTemplate.exchange(requestEntity, String.class);
//            RequestTaskItemPayload taskPayload = JSONObject.parseObject(exchange.getBody(), RequestTaskItemPayload.class);
//            RequestAuditItemPayload payload = new RequestAuditItemPayload();
//            payload.setCustom(taskPayload.getData().getCustomBean(ywcode));
//            payload.setStatus(taskPayload.getSTATUS().getStatusBean());
//            if(!payload.isOk()){
//                throw new RequestInferfaceException(payload.getStatus().getText());
//            }
//            return payload;
//        } catch (HttpClientErrorException e) {
//            if("403 Forbidden".equals(e.getMessage())){
//                approveAuditItemsSourceApi.getAccessToken(true);
//            }else {
//                throw e;
//            }
//        } catch (Exception e) {
//            log.error(e.getMessage(),e);
//        }
        return null;
    }





    private static Map<String, Object> commonAreaRequestParams(String accessToken, String catalogCode,
                                                               String taskCode,String deptCode,String serve, String theme, String isHistory) {
        Map<String, Object> map = new HashMap<>();
        map.put("access_token",accessToken);
        Map<String, Object> sub = new HashMap<>();
        sub.put("AREA_CODE","450721");
        sub.put("CATALOG_CODE",catalogCode);
        sub.put("TASK_CODE",taskCode);
        sub.put("DEPT_CODE",deptCode);
        sub.put("SERVE", serve);
        sub.put("THEME", theme);
        sub.put("IS_HISTORY", isHistory);
        map.put("param",sub);
        return map;
    }

    private static Map<String, Object> requestParams(String accessToken,
                                                     String itemCode) {
        Map<String, Object> map = new HashMap<>();
        map.put("access_token",accessToken);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("AREA_CODE","450721");
        String[] split = itemCode.split(",");
        if(split.length<3){
            throw new RequestInferfaceException("itemCode 格式出错");
        }
        map1.put("CATALOG_CODE",split[0]);
        map1.put("TASK_CODE",split[1]);
        map1.put("DEPT_CODE", split[2]);
        //map.put(FROM_TIMESTAMP,"0");
        // map.put(ITEM_LIMIT,"99");
        //map1.put("SERVE", "1");
        //map1.put("THEME", "005");
        map1.put("IS_HISTORY", "0");
        map.put("param",map1);
        return map;
    }

    private static Map<String, Object> requestParams(String accessToken, String serve, String theme, Long timestamp) {
        Map<String, Object> map = new HashMap<>();
        map.put("access_token",accessToken);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("AREA_CODE","AREA_CODE_VALUE");
        if(timestamp != null) map1.put("TIME_STAMP",timestamp);
        map1.put("TASK_STATE","1");
        map1.put("ITEM_LIMIT",100);
        if(!StringUtils.isEmpty(serve) && !StringUtils.isEmpty(theme)){
            map1.put("SERVE", serve);
            map1.put("THEME", theme);
        }
        map1.put("IS_HISTORY", "0");
        map.put("param",map1);
        return map;
    }
    private static Map<String, Object> requestParamsDept(String accessToken, String deptCode, Long timestamp) {
        Map<String, Object> map = new HashMap<>();
        map.put("access_token",accessToken);
        Map<String, Object> param = new HashMap<>();
        param.put("DEPT_CODE", deptCode);
        if(timestamp != null) param.put("TIME_STAMP",timestamp);
        //map.put(ITEM_LIMIT,999);//
        param.put("ITEM_LIMIT",30);//2020-12-31 新接口最大只能100
        map.put("param",param);
        return map;
    }







}
