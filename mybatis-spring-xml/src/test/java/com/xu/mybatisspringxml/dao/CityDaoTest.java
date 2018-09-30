package com.xu.mybatisspringxml.dao;

import com.xu.mybatisspringxml.pojo.City;
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

    @Test
    public void insertCitys() {
        List<City> list = new ArrayList<>(99);
        for (int i = 0;i<99;i++){
            City city = new City();
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
    }
}
