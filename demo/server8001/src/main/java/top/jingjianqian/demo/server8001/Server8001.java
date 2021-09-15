package top.jingjianqian.demo.server8001;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Server8001 {
    public static void main(String[] args) {
        SpringApplication.run(Server8001.class,args);
    }

}
