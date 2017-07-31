package com.springboot.proterties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by liuruiyan on 2017/7/21.
 */
@Component
public class UserProperties01 {

    @Value("${user.id}")
    private Long id;

    @Value("${user.age}")
    private Integer age;

    @Value("${user.desc}")
    private String desc;

    @Value("${user.uuid}")
    private String uuid;

    public Long getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getDesc() {
        return desc;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "UserProperties01{" +
                "id=" + id +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
