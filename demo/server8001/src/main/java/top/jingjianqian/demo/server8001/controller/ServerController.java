package top.jingjianqian.demo.server8001.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ServerController {


    @RequestMapping("/getRandomNumber")
    public Object getRandomNumber(){
        StringBuilder s = new StringBuilder();

        for(int i = 0; i<5; i++){
            Random r = new Random(i);
            s.append(r.nextInt(100)).append("-");
        }
        return s.toString();
    }
}
