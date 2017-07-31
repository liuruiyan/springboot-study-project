package com.springboot.dao;

import com.springboot.bean.City;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liuruiyan on 2017/7/24.
 */
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);

    String findCityNameById(Integer id);

}
