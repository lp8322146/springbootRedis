package com.lp.demo.biz.impl;

import com.lp.demo.biz.FoodTyepBiz;
import com.lp.demo.dao.FoodTypeRepository;
import com.lp.demo.entity.FoodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品类型业务层
 */
@Service
public class FoodTyepBizImpl implements FoodTyepBiz{
    //自动装配
    @Autowired
    FoodTypeRepository foodTypeRepository;

    /**
     * 全查商品类型
     * @return
     */
    @Override
    public List<FoodType> findAllFoodType() {

        List<FoodType> foodType = foodTypeRepository.findAll();
        return foodType;
    }
}
