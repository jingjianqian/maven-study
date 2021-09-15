package com.ucap.ms.approve.api.vo;

import com.alibaba.fastjson.JSONObject;
import com.ucap.ms.approve.api.payload.RequestTokenPayload;
import com.ucap.ms.approve.config.ConfigClientController;
import com.ucap.ms.approve.exception.RequestInferfaceException;
import com.ucap.ms.base.enums.CacheCodeEnum;
import com.ucap.ms.base.utils.BaseHttpRequestUtils;
import com.ucap.ms.cache.util.CommonCacheUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;


import javax.annotation.Resource;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * 接口对接
 */
@Component
public class ApproveAuditItemsSourceApi {

    @Resource
    public  ConfigClientController configClientController;

    @Resource
    public CommonCacheUtil commonCacheUtil;


    private static final Logger logger = LoggerFactory.getLogger(ApproveAuditItemsSourceApi.class);


    public  JSONObject getAuditItemsDeptLimit(String dept_code,Long timestamp){
        try {
            String accessToken = getAccessToken(null);
            if(accessToken == null){
                throw new RequestInferfaceException("获取 access token 失败");

            }

            Map<String, Object> map = requestParamsDept(accessToken, dept_code, timestamp);

            Map<String,Object> httpClientParamMap = new HashMap<String,Object>();
            Map<String,Object> paramMap = new HashMap<String,Object>();
            httpClientParamMap.put("access_token", accessToken);
            paramMap.put("DEPT_CODE", dept_code);
            paramMap.put("ITEM_LIMIT",50);
            paramMap.put("TIME_STAMP",timestamp);
            paramMap.put("TASK_STATE","1"); // 状态 - 1 在用 2 暂停 3 取消
            paramMap.put("IS_HISTORY", "0"); // 1-获取历史版本 0-获取最新版本
            // 01 行政许可  02 行政处罚 03 行政强制 04 行政征收
            // 05 行政给付 06 行政检查 07 行政确认 08 行政奖励
            // 09 行政裁决  10 其他行政权力  20 公共服务
            paramMap.put("TASK_TYPE", "01,05,07,08,09,10,20");
            httpClientParamMap.put("param",paramMap);

            String resultMsg = BaseHttpRequestUtils.sendPostWithJson(configClientController.getGET_DEPTAUDITITEM_URL(), httpClientParamMap);
            JSONObject jsonObject = JSONObject.parseObject(resultMsg);

            return jsonObject;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public  String getAccessToken(Boolean refreshToken){


        String access_token = null;
        try{
//            if(!Boolean.TRUE.equals(refreshToken)){
//                String apiToken = (String) commonCacheUtil.getCache(CacheCodeEnum.INNERWEB.getValue()).get("audit_item_api_token");
//                if (apiToken != null) {
//                    return apiToken;
//                }
//            }
//            MultiValueMap<String, Object> postParameters = new LinkedMultiValueMap<>();
//            postParameters.add(configClientController.getGRANT_TYPE(), configClientController.getGRANT_TYPE_VALUE());
//            postParameters.add(configClientController.getCLIENT_ID(), configClientController.getCLIENT_ID_VALUE());
//            postParameters.add(configClientController.getCLIENT_SECRET(), configClientController.getCLIENT_SECRET_VALUE());
//            RequestEntity<MultiValueMap<String, Object>> requestEntity = RequestEntity.post(new URL(configClientController.getGET_TOKEN_URL()).toURI())
//                    .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                    .accept(MediaType.APPLICATION_JSON_UTF8)
//                    .body(postParameters);
//            ResponseEntity<String> exchange = restTemplate.exchange(requestEntity, String.class);
//            RequestTokenPayload payload = JSONObject.parseObject(exchange.getBody(),RequestTokenPayload.class);
//            if(!payload.isOk()){
//                throw new RequestInferfaceException(payload.getStatus().getText());
//            }
//            access_token = payload.getCustom().getAccessToken();
//            commonCacheUtil.getCache(CacheCodeEnum.INNERWEB.getValue()).add(configClientController.getKEY_AUDIT_ITEM_API_TOKEN(), access_token, 20L);
        }catch (Exception e){
            e.printStackTrace();
        }
        return access_token;
    }


    private  Map<String, Object> requestParamsDept(String accessToken, String deptCode, Long timestamp) {
        Map<String, Object> map = new HashMap<>();

        map.put(configClientController.getACCESS_TOKEN(),accessToken);
        Map<String, Object> param = new HashMap<>();
        param.put(configClientController.getDEPT_CODE(), deptCode);
        if(timestamp != null){
            param.put("TIME_STAMP",timestamp);
        }
        param.put("ITEM_LIMIT",50);//2020-12-31 新接口最大只能100
        param.put("IS_HISTORY", "0");
        map.put("param",param);
        return map;
    }


    private  Map<String, String> requestParamsDeptT(String accessToken, String deptCode, Long timestamp) {
        Map<String, String> map = new HashMap<>();

        map.put(configClientController.getACCESS_TOKEN(),accessToken);
        Map<String, Object> param = new HashMap<>();
        param.put(configClientController.getDEPT_CODE(), deptCode);
        if(timestamp != null){
            param.put("TIME_STAMP",timestamp.toString());
        }
        param.put("ITEM_LIMIT",30);//2020-12-31 新接口最大只能100
        param.put("IS_HISTORY", "0");
        map.put("param",param.toString());
        return map;
    }
}
