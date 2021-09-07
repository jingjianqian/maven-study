package top.jingjianqian.webService.innerWeb;


import com.ucap.ms.base.data.ResultModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import top.jingjianqian.webService.innerWeb.openfeign.MyClient;

import javax.annotation.Resource;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class InnerWebServer {

    @Resource
    MyClient client;

    public static void main(String[] args) {
        SpringApplication.run(InnerWebServer.class,args);
    }


    @RequestMapping("/test")
    public ResultModel one(String deptCode){
        return client.one(deptCode);
    }
}
