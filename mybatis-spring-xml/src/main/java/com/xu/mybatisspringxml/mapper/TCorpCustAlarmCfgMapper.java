package com.xu.mybatisspringxml.mapper;

import com.xu.mybatisspringxml.pojo.TCorpCustAlarmCfg;
import com.xu.mybatisspringxml.pojo.TCorpCustAlarmCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCorpCustAlarmCfgMapper {
    long countByExample(TCorpCustAlarmCfgExample example);

    int deleteByExample(TCorpCustAlarmCfgExample example);

    int deleteByPrimaryKey(String recId);

    int insert(TCorpCustAlarmCfg record);

    int insertSelective(TCorpCustAlarmCfg record);

    List<TCorpCustAlarmCfg> selectByExample(TCorpCustAlarmCfgExample example);

    TCorpCustAlarmCfg selectByPrimaryKey(String recId);

    int updateByExampleSelective(@Param("record") TCorpCustAlarmCfg record, @Param("example") TCorpCustAlarmCfgExample example);

    int updateByExample(@Param("record") TCorpCustAlarmCfg record, @Param("example") TCorpCustAlarmCfgExample example);

    int updateByPrimaryKeySelective(TCorpCustAlarmCfg record);

    int updateByPrimaryKey(TCorpCustAlarmCfg record);
}