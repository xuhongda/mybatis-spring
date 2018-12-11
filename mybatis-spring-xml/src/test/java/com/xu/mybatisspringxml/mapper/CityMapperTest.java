package com.xu.mybatisspringxml.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.xu.mybatisspringxml.pojo.City;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author xuhongda on 2018/9/30
 * com.xu.mybatisspringxml.mapper
 * mybatis-spring
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
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

    @Test
    public void selectCitys() {
        City city = new City();
        city.setName("SZ");
        RowBounds rowBounds = new RowBounds(1, 5);
        List<City> cities = cityMapper.selectCityss(city, rowBounds);
        PageList<City> pageList = (PageList<City>) cities;
        //总数量
        System.out.println(pageList.getPaginator().getTotalCount());
        System.out.println(cities.size());
    }

    @Test
    public void testResultType() {

        City city = cityMapper.getInfo(6);
        log.info("city->{}", city);
    }
}