package top.jingjianqian.webService.innerWeb;


import com.ucap.ms.base.data.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import top.jingjianqian.webService.innerWeb.openfeign.MyClient;

import javax.annotation.Resource;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RestController
public class InnerWebServer {



    @Resource
    MyClient myClient;

    public static void main(String[] args) {
        SpringApplication.run(InnerWebServer.class,args);
    }





    @Component
    @FeignClient(value = "PLATFORM-APPROVE")
    interface HelloClient {
        @PostMapping(value = "/approveStepItem/auditItemsNotifyDept")
        String auditItemsNotifyDept(@RequestParam("deptCode") String deptCode);
    }

    @RequestMapping("/approveStepItem/auditItemsNotifyDept")
    public ResultModel auditItemsNotifyDept() {
        return myClient.one();
    }


    @RequestMapping("/approveStepItem/auditItemsNotifyDept12")
    public String auditItemsNotifyDept12(String deptCode) {
        return "1";
    }

}
