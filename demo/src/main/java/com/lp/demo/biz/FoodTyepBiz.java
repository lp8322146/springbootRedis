package com.lp.demo.biz;

import com.lp.demo.entity.FoodType;

import java.util.List;

/**
 * 商品类型接口
 */
public interface FoodTyepBiz {
    /**
     * 全查商品类型
     * @return
     */
    List<FoodType> findAllFoodType();
}
