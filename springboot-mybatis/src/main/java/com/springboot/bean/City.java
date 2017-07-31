package com.springboot.bean;

/**
 * Hello world!
 *
 */
public class City
{
    private Integer cityId;

    private String gbCode;

    private String cityName;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getGbCode() {
        return gbCode;
    }

    public void setGbCode(String gbCode) {
        this.gbCode = gbCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", gbCode='" + gbCode + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
