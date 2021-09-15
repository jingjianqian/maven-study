package top.jingjianqian.demo.openfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "SERVER8001")
public interface ClientFeignService {

    @GetMapping(value = "/getRandomNumber")
    String getRandomNumber();

}
