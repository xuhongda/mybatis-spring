package com.xu.mybatisspringxml.pojo;

import com.xu.mybatisspringxml.basepojo.BasePageBean;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City extends BasePageBean {
    private Integer id;

    private String name;

    private String state;

    private String country;


}