package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TVehicleExtPropCfg;
import pojo.TVehicleExtPropCfgExample;

public interface TVehicleExtPropCfgMapper {
    long countByExample(TVehicleExtPropCfgExample example);

    int deleteByExample(TVehicleExtPropCfgExample example);

    int deleteByPrimaryKey(String vehicleId);

    int insert(TVehicleExtPropCfg record);

    int insertSelective(TVehicleExtPropCfg record);

    List<TVehicleExtPropCfg> selectByExample(TVehicleExtPropCfgExample example);

    TVehicleExtPropCfg selectByPrimaryKey(String vehicleId);

    int updateByExampleSelective(@Param("record") TVehicleExtPropCfg record, @Param("example") TVehicleExtPropCfgExample example);

    int updateByExample(@Param("record") TVehicleExtPropCfg record, @Param("example") TVehicleExtPropCfgExample example);

    int updateByPrimaryKeySelective(TVehicleExtPropCfg record);

    int updateByPrimaryKey(TVehicleExtPropCfg record);
}