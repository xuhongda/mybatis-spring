package com.xu.mybatisspringxml.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author xuhongda on 2019/1/2
 * com.xu.mybatisspringxml.pojo
 * mybatis-spring
 */
@Data
@ToString
public class ResultVO {

    private List<City> cities;
}
