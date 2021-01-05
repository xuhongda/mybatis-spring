package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TCorpExtPropDict;
import pojo.TCorpExtPropDictExample;

public interface TCorpExtPropDictMapper {
    long countByExample(TCorpExtPropDictExample example);

    int deleteByExample(TCorpExtPropDictExample example);

    int deleteByPrimaryKey(String corpId);

    int insert(TCorpExtPropDict record);

    int insertSelective(TCorpExtPropDict record);

    List<TCorpExtPropDict> selectByExample(TCorpExtPropDictExample example);

    TCorpExtPropDict selectByPrimaryKey(String corpId);

    int updateByExampleSelective(@Param("record") TCorpExtPropDict record, @Param("example") TCorpExtPropDictExample example);

    int updateByExample(@Param("record") TCorpExtPropDict record, @Param("example") TCorpExtPropDictExample example);

    int updateByPrimaryKeySelective(TCorpExtPropDict record);

    int updateByPrimaryKey(TCorpExtPropDict record);
}