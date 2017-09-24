package com.lp.demo.vo;

import com.lp.demo.entity.FoodType;
import com.lp.demo.entity.Foods;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * VO类，将前端所需要的数据封装为一个类，前端获取数据时，一并提交给前段。
 * @param <T>
 */
@Data
public class FoodsVo<T> {
    //前端格式
    private int errno;
    //数据库查询出的数据
    private List<Foods> data = new ArrayList<>();
}
