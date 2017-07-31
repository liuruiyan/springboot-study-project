package com.springboot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * Spring boot 启动类
 *
 * Created by liuruiyan on 2017/7/20.
 */
@SpringBootApplication
@MapperScan("com.springboot.dao") //用这个注解可以注册 Mybatis mapper 接口类。
@ComponentScan(basePackages = {"com.springboot"})  //扫描注解类
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
