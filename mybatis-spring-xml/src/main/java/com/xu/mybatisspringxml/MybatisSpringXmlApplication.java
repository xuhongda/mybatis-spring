package com.xu.mybatisspringxml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xu.mybatisspringxml.mapper")
public class MybatisSpringXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringXmlApplication.class, args);
    }
}
