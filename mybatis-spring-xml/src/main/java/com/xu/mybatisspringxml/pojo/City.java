package com.xu.mybatisspringxml.pojo;

import com.xu.mybatisspringxml.basepojo.BasePageBean;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class City extends BasePageBean {
    private Integer id;

    private String name;

    private String state;

    private String country;

    private String xx;

}