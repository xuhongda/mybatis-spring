package com.xu.mybatisspringxml.pojo;

public class CityForWeather {
    private String cityId;

    private String cityNum;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getCityNum() {
        return cityNum;
    }

    public void setCityNum(String cityNum) {
        this.cityNum = cityNum == null ? null : cityNum.trim();
    }
}