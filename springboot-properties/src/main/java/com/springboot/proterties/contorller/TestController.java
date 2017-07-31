package com.springboot.proterties.contorller;

import com.springboot.proterties.UserProperties;
import com.springboot.proterties.UserProperties01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuruiyan on 2017/7/21.
 */
@Controller
@RequestMapping("/properties")
public class TestController {

    @Autowired
    private UserProperties userProperties;

    @Autowired
    private UserProperties01 userProperties01;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        return "user: "+userProperties.toString() +" , user01:"+userProperties01.toString();

    }

}
