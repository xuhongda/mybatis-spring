package com.xu.mybatisspringxml.dao;

import com.xu.mybatisspringxml.pojo.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuhongda on 2018/9/30
 * com.xu.mybatisspringxml.dao
 * mybatis-spring
 */
@Repository
public class CityDao {

    private SqlSession sqlSession;

    public CityDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public int insertCitys(List<City> cities){
       return sqlSession.insert("insertCitys",cities);
    }
}
