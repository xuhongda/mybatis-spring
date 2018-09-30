package com.xu.mybatisspringxml.mapper;

import com.xu.mybatisspringxml.pojo.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author xuhongda on 2018/9/30
 * com.xu.mybatisspringxml.mapper
 * mybatis-spring
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CityMapperTest {
    @Autowired
    private CityMapper cityMapper;

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        City city = new City();
        city.setName("xx");
        cityMapper.insert(city);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}