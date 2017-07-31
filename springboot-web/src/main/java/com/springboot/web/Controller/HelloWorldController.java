package com.springboot.web.Controller;

import com.springboot.bean.City;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuruiyan on 2017/7/20.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/test")
    public String helloWorld(){

     return "hello world";
    }

    @RequestMapping("/testDao")
    public City getCity(@RequestParam(value = "cityName", required = true) String cityName){

        return cityService.queryCityByName(cityName);
    }

    @RequestMapping("/dao")
    public String getCityNameById(Integer id){
        return cityService.queryCityNameById(id);
    }

}
