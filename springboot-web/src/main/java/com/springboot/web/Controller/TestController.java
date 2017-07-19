package com.springboot.web.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuruiyan on 2017/7/18.
 */
@RestController
@EnableAutoConfiguration
public class TestController {


    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){

        return "helloworld!";
    }


    public static void main(String[] args) {
        SpringApplication.run(TestController.class,args);
    }

}
