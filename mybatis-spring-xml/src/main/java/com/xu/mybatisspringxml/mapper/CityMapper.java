package com.xu.mybatisspringxml.mapper;

import com.xu.mybatisspringxml.pojo.City;
import com.xu.mybatisspringxml.pojo.CityExample;
import java.util.List;

import com.xu.mybatisspringxml.pojo.CityVO;
import com.xu.mybatisspringxml.pojo.Country;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CityMapper {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<City> selectCityss(@Param("city") City city, RowBounds rowBounds);

    /**
     * 自定义测试 resultType
     *
     * @param i
     * @return
     */
    City getInfo(int i);

    List<CityVO> getInfoByMap();

    List<CityVO> getInfoByType();

    /**
     * @param countries
     * @return
     */
    List<List<City>> citys(@Param("countries") List<String> countries);
}