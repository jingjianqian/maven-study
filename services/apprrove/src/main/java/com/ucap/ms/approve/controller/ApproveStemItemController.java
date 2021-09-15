package com.ucap.ms.approve.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ucap.ms.approve.api.payload.RequestAuditItemPayload;
import com.ucap.ms.approve.api.vo.ApproveAuditItemApi;
import com.ucap.ms.base.data.RestResultBuilder;
import com.ucap.ms.base.data.ResultModel;
import com.ucap.ms.base.enums.CacheCodeEnum;
import com.ucap.ms.base.utils.BaseHttpRequestUtils;
import com.ucap.ms.cache.aspect.CacheAnnotation;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/approveStepItem")
@RefreshScope
public class ApproveStemItemController {



    @Resource
    protected HttpServletRequest httpServletRequest;

    String auditItemsNotifyDeptUrl =  "http://localhost:9107/approveStepItem/auditItemsNotifyDept";
    String auditItemsByYwCodeUrl = "http://localhost:9107/approveStepItem/auditItemsByYwCode";



    @Resource
    private ApproveAuditItemApi approveAuditItemApi;
    @Value("${config.param_values.dept_codes}")
    private String auditItemsNotifyDeptDeptCodes;//部门服务-分部门


    private static final Logger logger = LoggerFactory.getLogger(ApproveStemItemController.class);


    @ApiOperation(value = "根据实施主体编码查询接口事项列表信息", notes="实施主体编码查询接口事项列表信息-打印告知单")
    @ApiImplicitParam(name = "deptCode",value = "实施主体编码", required = true, dataType = "String")
    @RequestMapping(value = "/auditItemsNotifyDept" , method = RequestMethod.POST)
    @CacheAnnotation(cacheCode = CacheCodeEnum.INNERWEB, dataKey = "auditItemsNotifyDept")
    public ResultModel auditItemsNotifyDept(@RequestParam String deptCode){
        try{
            String _loadSourceData = httpServletRequest.getParameter("_loadSourceData");
            JSONObject data = approveAuditItemApi.getAuditItemsLimit(deptCode);
            if(_loadSourceData.equalsIgnoreCase("true")){
                loadSourceDatasAuditItemsByYwCode(data.toString());
            }
            if(data != null && data.toJSONString().indexOf("\"00\"") >= 0) {
                return RestResultBuilder.builder().success(data).build();
            } else
                return RestResultBuilder.builder().message("根据实施主体编码查询接口调用失败").build();
        }catch (Exception e) {
            logger.error("打印告知单接口获取数据失败", e);
        }
        return null;
    }



    @ApiOperation(value="根据事项总编码、业务办理项编码，查询项目事项库列表信息",notes="查询项目事项库列表信息-外部")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "itemCode",value = "事项总编码-(基本编码,实施编码,实施主体编码)", required = true, dataType = "String"),
            @ApiImplicitParam(name = "ywcode",value = "业务办理项编码", required = false, dataType = "String")
    })
    @CacheAnnotation(cacheCode = CacheCodeEnum.INNERWEB, dataKey = "auditItemsByYwCode")
    @RequestMapping(value="/auditItemsByYwCode", method = RequestMethod.POST)
    public ResultModel auditItemsByYwCode(String itemCode, String ywcode) throws Exception  {
        RequestAuditItemPayload auditItems = approveAuditItemApi.getAuditItemsByYwcode(itemCode, ywcode);
        if(auditItems != null && "00".equals(auditItems.getStatus().getCode())) {
            return RestResultBuilder.builder().success(JSONObject.toJSONString(auditItems)).build();
        } else
            return RestResultBuilder.builder().message("根据事项总编码、业务办理项编码，查询项目事项库接口调用失败").build();
    }



    /**
     * 3、刷新法人服务分类查询缓存
     */
    @RequestMapping(value = "/loadSourceDataAuditItemsNotifyDept", method = RequestMethod.POST)
    public void loadSourceDataAuditItemsNotifyDept(){
        try {
            Map<String,String> paramMap = new HashMap();
            paramMap.put(CacheAnnotation.FLAG_LOAD_SOURCE_DATA,"true");//

            String [] auditItemsNotifyDeptDeptCodesArray = auditItemsNotifyDeptDeptCodes.split(",");
            if(auditItemsNotifyDeptDeptCodesArray != null && auditItemsNotifyDeptDeptCodesArray.length > 0) {
                for(int i=0;i < auditItemsNotifyDeptDeptCodesArray.length;i++){
                    paramMap.put("deptCode",auditItemsNotifyDeptDeptCodesArray[i]);
                    String response = sendRequestAndTry("POST",auditItemsNotifyDeptUrl,paramMap);
                    loadSourceDatasAuditItemsByYwCode(response);
                }

            }else{
                logger.info(this.getClass().getName(),",刷新缓存获取部门配置失败！！");
            }


        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
    }



    /**
     * 5、刷新办事指南缓存
     */
    private void loadSourceDatasAuditItemsByYwCode(String responseStr){
        try {
            JSONObject resultObj = JSONObject.parseObject(responseStr);
            if(resultObj == null) {
                logger.warn("parse json fail，responseStr is:" + responseStr);
                return;
            }
            JSONObject dataOuter = resultObj.getJSONObject("data");
            if(dataOuter == null) {
                logger.warn("parse json fail-no dataOuter，responseStr is:" + responseStr);
                return;
            }
            JSONObject dataInner = dataOuter.getJSONObject("data");
            if(dataInner == null) {
                logger.warn("parse json faill-no dataInner，responseStr is:" + responseStr);
                return;
            }
            JSONArray list = dataInner.getJSONArray("list");
            if(list == null || list.size() == 0) {
                logger.warn("parse json fail-no list，responseStr is:" + responseStr);
                return;
            }

            List<String> itemCodes = new ArrayList<>();
            List<String> ywCodes = new ArrayList<>();
            for(int i=0;i < list.size();i++) {
                JSONObject auditItem = (JSONObject)((JSONObject)list.get(i)).get("AUDIT_ITEM");
                String itemCode = auditItem.get("catalog_code") + "," + auditItem.get("task_code") + "," + auditItem.get("dept_code");
                itemCodes.add(itemCode);
                ywCodes.add((String)auditItem.get("ywcode"));
            }

            Map<String,String> paramMap = new HashMap();
            paramMap.put(CacheAnnotation.FLAG_LOAD_SOURCE_DATA,"true");

            if(itemCodes != null && itemCodes.size() > 0) {
                for(int i=0;i < itemCodes.size();i++){
                    paramMap.put("itemCode",itemCodes.get(i));
                    paramMap.put("ywcode",ywCodes.get(i));
                    logger.info(String.valueOf(i));
                    //Thread.sleep(3000);
                    sendRequestAndTry("POST", auditItemsByYwCodeUrl, paramMap);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
    }


    private String sendRequestAndTry(String method,String url,Map paramMap) throws Exception{
        int tryCount = 0;
        while (tryCount <= 10) {
            String response = BaseHttpRequestUtils.sendRequest(method, url, paramMap);
            if(RestResultBuilder.builder().failure().build().toString().equals(response)) {
                //Thread.sleep(3000);
                tryCount++;
                logger.info("sendRequestAndTry fail，URL： " + url + " ,paramMap："
                        + new ObjectMapper().writeValueAsString(paramMap) + "，tryCount:" + tryCount);
                continue;
            }
            logger.info("sendRequestAndTry success，URL： " + url + " ,paramMap："
                    + new ObjectMapper().writeValueAsString(paramMap));
            return response;
        }
        return RestResultBuilder.builder().failure().build().toString();
    }




}
