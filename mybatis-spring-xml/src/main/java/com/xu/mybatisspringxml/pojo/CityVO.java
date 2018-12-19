package com.xu.mybatisspringxml.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author xuhongda on 2018/12/19
 * com.xu.mybatisspringxml.pojo
 * mybatis-spring
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class CityVO extends City {

    private String count;


}
