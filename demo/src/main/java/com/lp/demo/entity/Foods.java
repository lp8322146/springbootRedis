/**
  * Copyright 2017 bejson.com 
  */
package com.lp.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

/**
 * Auto-generated: 2017-09-19 9:4:58
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */

/**
 * lombok小插件，省略get,set
 */
@Data
/**
 * 表示该类为实体类
 */
@Entity
public class Foods {
    /**
     * 是否主键
     */
    @Id
    /**
     * 主键自增
     */
    @GeneratedValue
    private Integer id;
    /**
     * 生成Json时忽略
     */
    @JsonIgnore
    private Integer typeId;
    private String name;
    private int price;
    private String oldPrice;
    private String description;
    private int sellCount;
    private int rating;
    private String info;
    /**
     * 生成表时忽略
     */
    @Transient
    private List<Ratings> ratings;
    private String icon;
    private String image;

}