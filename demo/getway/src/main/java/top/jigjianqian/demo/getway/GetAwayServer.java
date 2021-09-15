package top.jigjianqian.demo.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetAwayServer {
    public static void main(String[] args) {
        SpringApplication.run(GetAwayServer.class,args);
    }
}
