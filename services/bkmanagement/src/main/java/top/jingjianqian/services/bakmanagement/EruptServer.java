package top.jingjianqian.services.bakmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import xyz.erupt.core.annotation.EruptScan;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan
@EruptScan()
public class EruptServer {
    public static void main(String[] args){
        SpringApplication.run(EruptServer.class,args);
    }
}
