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
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class SellerInfo {
    @Id
    @JsonIgnore
    @GeneratedValue
    private Integer id;
    private String name;//商家名
    private String description;
    private Integer deliveryTime;
    private double score;
    private double serviceScore;
    private double foodScore;
    private double rankRate;
    private Integer minPrice;//起送价格
    private Integer deliveryPrice;
    private Integer ratingCount;
    private Integer sellCount;
    private String bulletin;
    private String avatar;//商家图片
    @Transient
    private List<String> pics = new ArrayList<String>();
    @Transient
    private List<String> infos= new ArrayList<String>();

}