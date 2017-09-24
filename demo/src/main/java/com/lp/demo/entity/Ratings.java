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
@Data
@Entity
public class Ratings {
    @Id
    @GeneratedValue
    private Integer id;
    @JsonIgnore
    private int foodId;
    private String username;
    private Integer rateTime;
    private int deliveryTime;
    private int score;
    private int rateType;
    private String text;
    private String avatar;
    @Transient
    private List<String> recommend;

}