package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TestServer {
    public static void main(String[] args) {
        SpringApplication.run(TestServer.class,args);
    }



    @RequestMapping("/approveStepItem/auditItemsNotifyDept")
    public String auditItemsNotifyDept12(String deptCode) {
        return "1";
    }
}
