package com.xu.mybatisspringxml.mapper;

import com.xu.mybatisspringxml.pojo.CityDistrictIdTemp;
import com.xu.mybatisspringxml.pojo.CityDistrictIdTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityDistrictIdTempMapper {
    long countByExample(CityDistrictIdTempExample example);

    int deleteByExample(CityDistrictIdTempExample example);

    int deleteByPrimaryKey(Integer areacode);

    int insert(CityDistrictIdTemp record);

    int insertSelective(CityDistrictIdTemp record);

    List<CityDistrictIdTemp> selectByExample(CityDistrictIdTempExample example);

    CityDistrictIdTemp selectByPrimaryKey(Integer areacode);

    int updateByExampleSelective(@Param("record") CityDistrictIdTemp record, @Param("example") CityDistrictIdTempExample example);

    int updateByExample(@Param("record") CityDistrictIdTemp record, @Param("example") CityDistrictIdTempExample example);

    int updateByPrimaryKeySelective(CityDistrictIdTemp record);

    int updateByPrimaryKey(CityDistrictIdTemp record);

    int insertList(List<CityDistrictIdTemp> list);
}