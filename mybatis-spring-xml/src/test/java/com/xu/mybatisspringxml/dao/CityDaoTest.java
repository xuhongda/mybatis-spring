package com.xu.mybatisspringxml.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xu.mybatisspringxml.pojo.City;
import org.apache.ibatis.session.RowBounds;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuhongda on 2018/9/30
 * com.xu.mybatisspringxml.dao
 * mybatis-spring
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CityDaoTest {
    Logger log = LoggerFactory.getLogger(Test.class);
    @Autowired
    private CityDao cityDao;

    @Test
    public void insertCity() {

    }

    /**
     * 批量插入
     */
    @Test
    public void insertCitys() {
        List<City> list = new ArrayList<>(99);
        for (int i = 0; i<99; i++){
            City city = new City();
            city.setName("SZ");
            city.setCountry("ZH");
            list.add(city);
        }
        int i = cityDao.insertCitys(list);
        log.info("i",i);
        Assertions.assertThat(i).isEqualTo(99);
    }

    @Test
    public void deleteCity() {
    }

    @Test
    public void deleteCitys() {
    }

    @Test
    public void selectCity() {
    }

    @Test
    public void selectCitys() {
        //分页
        Page<Object> objects = PageHelper.startPage(1, 5);
        City city = new City();
        city.setName("SZ");
        RowBounds rowBounds = new RowBounds(1, 5);
        List<City> cities = cityDao.selectCitys(city, rowBounds);
        PageInfo<City> pageInfo = new PageInfo(cities, 7);
        System.out.println(cities.size());
    }
}
