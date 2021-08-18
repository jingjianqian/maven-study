package com.ucap.ms.approve.controller;


import com.alibaba.fastjson.JSONObject;
import com.ucap.ms.approve.api.vo.ApproveAuditItemApi;
import com.ucap.ms.base.data.RestResultBuilder;
import com.ucap.ms.base.data.ResultModel;
import com.ucap.ms.base.enums.CacheCodeEnum;
import com.ucap.ms.cache.aspect.CacheAspectAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/approveStepItem")
public class ApproveStemItemController {


    @Resource
    private RestTemplate restTemplate;

    @Resource
    private ApproveAuditItemApi approveAuditItemApi;
    private static final Logger logger = LoggerFactory.getLogger(ApproveStemItemController.class);

    @CacheAspectAnnotation(dataKey = "auditItemsNotifyDept", cacheCode = CacheCodeEnum.INNERWEB)
    @RequestMapping(value = "/auditItemsNotifyDept" , method = RequestMethod.POST)
    public ResultModel auditItemsNotifyDept(@RequestParam String deptCode){
        try{
            JSONObject data = approveAuditItemApi.getAuditItemsLimit(deptCode);
            System.out.println("data------------->" +  data);
            if(data != null && data.toJSONString().indexOf("\"00\"") >= 0) {
                return RestResultBuilder.builder().success(data).build();
            } else
                return RestResultBuilder.builder().message("根据实施主体编码查询接口调用失败").build();
        }catch (Exception e) {
            logger.error("打印告知单接口获取数据失败", e);
        }
        return null;
    }
}
