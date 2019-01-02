package com.xu.mybatisspringxml.dao;

import com.github.pagehelper.PageInfo;
import com.xu.mybatisspringxml.pojo.City;
import org.apache.ibatis.session.RowBounds;
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
    private Logger log = LoggerFactory.getLogger(Test.class);
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
        List<City> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            City city = new City();
            city.setName("SZ");
            city.setCountry("ZH");
            list.add(city);
        }
        int i = cityDao.insertCitys(list);
        log.info("i",i);
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
        long l = System.currentTimeMillis();
        //分页
        //Page<Object> objects = PageHelper.startPage(1, 15);
        City city = new City();
        city.setName("SZ");
        RowBounds rowBounds = new RowBounds(1, 15);
        List<City> cities = cityDao.selectCitys(city, rowBounds);
        //List<City> cities = cityDao.selectCitysNoPage(city);
        PageInfo<City> pageInfo = new PageInfo(cities, 7);
        long l1 = System.currentTimeMillis();
        long ll = l1 - l;
        System.out.println("time===>>" + ll);
        System.out.println(cities.size());
    }
}
