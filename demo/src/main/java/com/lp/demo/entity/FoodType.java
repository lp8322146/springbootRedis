/**
  * Copyright 2017 bejson.com 
  */
package com.lp.demo.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

/**
 * Auto-generated: 2017-09-19 9:4:58
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@Entity
public class FoodType {

    private String name="热销榜";
    @Id
    @GeneratedValue
    private int type=1;
    @Transient
    private List<Foods> foods = new ArrayList<>();

}