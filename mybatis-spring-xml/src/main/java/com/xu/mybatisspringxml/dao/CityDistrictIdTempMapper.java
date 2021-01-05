package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CityDistrictIdTemp;
import pojo.CityDistrictIdTempExample;

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
}