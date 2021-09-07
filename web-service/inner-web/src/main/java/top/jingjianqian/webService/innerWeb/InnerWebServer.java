package top.jingjianqian.webService.innerWeb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RestController
public class InnerWebServer {



    @Autowired
    HelloClient clients;

    public static void main(String[] args) {
        SpringApplication.run(InnerWebServer.class,args);
    }



    @FeignClient(name = "platform-approve")
    interface HelloClient {
        @PostMapping(value = "/approveStepItem/auditItemsNotifyDept")
        String auditItemsNotifyDept(@RequestParam("deptCode") String deptCode);
    }

    @RequestMapping("/approveStepItem/auditItemsNotifyDept")
    public String auditItemsNotifyDept(String deptCode) {
        return clients.auditItemsNotifyDept(deptCode);
    }


    @RequestMapping("/approveStepItem/auditItemsNotifyDept12")
    public String auditItemsNotifyDept12(String deptCode) {
        return "1";
    }






//
//    @RequestMapping("/test")
//    public ResultModel one(String deptCode){
//        return client.one(deptCode);
//    }
}
