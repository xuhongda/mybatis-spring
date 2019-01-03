package com.xu.mybatisspringxml.mapper;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.xu.mybatisspringxml.pojo.Country;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author xuhongda on 2019/1/3
 * com.xu.mybatisspringxml.mapper
 * mybatis-spring
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class CountryMapperTest {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private CountryMapper countryMapper;

    /**
     * 多对多映射
     *
     * @throws JsonProcessingException
     */
    @Test
    public void test11() throws IOException {
        List<String> strings = Arrays.asList("ZH", "USA");
        List<Country> countries = countryMapper.citys(strings);
        Object o = JSON.toJSON(countries);
        log.info("{}", o);
        StringWriter stringWriter = new StringWriter();
        //使用 writeValue 生成指定
        objectMapper.writeValue(stringWriter, countries);
        objectMapper.writeValue(new File("countries.json"), countries);
        String s = stringWriter.toString();
        log.info("citys = {}", s);
    }
}