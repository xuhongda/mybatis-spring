package com.xu.mybatisspringxml.controller;

import com.xu.mybatisspringxml.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuhongda on 2018/9/30
 * com.xu.mybatisspringxml.controller
 * mybatis-spring
 */
@Controller
public class HelloController {

    /*@Autowired
    private CityDao cityDao;

    @GetMapping("insert")
    public Integer insert(City city){
        int i = cityDao.insertCity(city);
        return i;
    }*/
}
