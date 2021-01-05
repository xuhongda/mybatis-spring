package com.xu.mybatisspringxml.mapper;

import com.xu.mybatisspringxml.pojo.CityForWeather;
import com.xu.mybatisspringxml.pojo.CityForWeatherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityForWeatherMapper {
    long countByExample(CityForWeatherExample example);

    int deleteByExample(CityForWeatherExample example);

    int deleteByPrimaryKey(String cityId);

    int insert(CityForWeather record);

    int insertSelective(CityForWeather record);

    List<CityForWeather> selectByExample(CityForWeatherExample example);

    CityForWeather selectByPrimaryKey(String cityId);

    int updateByExampleSelective(@Param("record") CityForWeather record, @Param("example") CityForWeatherExample example);

    int updateByExample(@Param("record") CityForWeather record, @Param("example") CityForWeatherExample example);

    int updateByPrimaryKeySelective(CityForWeather record);

    int updateByPrimaryKey(CityForWeather record);
}