package top.jingjianqian.demo.openfeign.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jingjianqian.demo.openfeign.service.ClientFeignService;

import javax.annotation.Resource;

@RestController
public class FeignClientController {
    @Resource
    private ClientFeignService clientFeignService;


    @GetMapping(value = "/getRandomNumber")
    public String getRandomNumber(){
        return clientFeignService.getRandomNumber();
    }
}
