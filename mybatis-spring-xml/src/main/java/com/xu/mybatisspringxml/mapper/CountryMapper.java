package com.xu.mybatisspringxml.mapper;

import com.xu.mybatisspringxml.pojo.Country;
import com.xu.mybatisspringxml.pojo.CountryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CountryMapper {
    long countByExample(CountryExample example);

    int deleteByExample(CountryExample example);

    int insert(Country record);

    int insertSelective(Country record);

    List<Country> selectByExample(CountryExample example);

    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);
}