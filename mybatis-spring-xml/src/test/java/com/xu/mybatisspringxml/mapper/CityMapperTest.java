package com.xu.mybatisspringxml.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.xu.mybatisspringxml.pojo.City;
import com.xu.mybatisspringxml.pojo.CityVO;
import com.xu.mybatisspringxml.pojo.Country;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.Arrays;
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

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private CountryMapper countryMapper;

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

    /**
     * 复杂情况下 type 无法映射
     */
    @Test
    public void testResultType2() {

        List<CityVO> cityVOS = cityMapper.getInfoByType();
        cityVOS.forEach(a -> log.info(a.toString()));
    }

    /**
     * 复杂情况下 Map 的应用
     */
    @Test
    public void testMap() {
        List<CityVO> cities = cityMapper.getInfoByMap();
        cities.forEach(System.out::println);
        String country = cities.get(0).getCountry();
        Assert.isTrue(country != null, country);
    }


}