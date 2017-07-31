package com.springboot.service.impl;

import com.springboot.bean.City;
import com.springboot.dao.CityDao;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liuruiyan on 2017/7/24.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City queryCityByName(String cityName) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss sss");

        System.out.println(sdf.format(new Date()));

        City city = cityDao.findByName(cityName);

        System.out.println(sdf.format(new Date()));

        System.out.println(city.toString());

        return city;
    }


    @Override
    public String queryCityNameById(Integer id) {
        return cityDao.findCityNameById(id);
    }
}
