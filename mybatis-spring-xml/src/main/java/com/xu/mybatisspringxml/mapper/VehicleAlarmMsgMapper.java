package com.xu.mybatisspringxml.mapper;

import com.xu.mybatisspringxml.pojo.VehicleAlarmMsg;
import com.xu.mybatisspringxml.pojo.VehicleAlarmMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleAlarmMsgMapper {
    long countByExample(VehicleAlarmMsgExample example);

    int deleteByExample(VehicleAlarmMsgExample example);

    int deleteByPrimaryKey(String recUid);

    int insert(VehicleAlarmMsg record);

    int insertSelective(VehicleAlarmMsg record);

    List<VehicleAlarmMsg> selectByExample(VehicleAlarmMsgExample example);

    VehicleAlarmMsg selectByPrimaryKey(String recUid);

    int updateByExampleSelective(@Param("record") VehicleAlarmMsg record, @Param("example") VehicleAlarmMsgExample example);

    int updateByExample(@Param("record") VehicleAlarmMsg record, @Param("example") VehicleAlarmMsgExample example);

    int updateByPrimaryKeySelective(VehicleAlarmMsg record);

    int updateByPrimaryKey(VehicleAlarmMsg record);
}