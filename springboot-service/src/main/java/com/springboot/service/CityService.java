package com.springboot.service;

import com.springboot.bean.City;

/**
 * Created by liuruiyan on 2017/7/24.
 */
public interface CityService {

    City queryCityByName(String cityName);


    String queryCityNameById(Integer id);

}
