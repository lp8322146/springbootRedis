package com.lp.demo.controller;

import com.lp.demo.dao.SellerInfoRepository;
import com.lp.demo.dao.mapper.SellerInfoMapper;
import com.lp.demo.entity.FoodType;
import com.lp.demo.entity.Foods;
import com.lp.demo.entity.SellerInfo;
import com.lp.demo.vo.FoodsVo;
import com.lp.demo.vo.Sellervo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * redis缓存实现类
 */
@RestController
public class RedisController {
    //自动装配redisTemplate
    @Autowired
    RedisTemplate redisTemplate;
    //自动装配数据访问层
    @Autowired
    SellerInfoRepository sellerInfoRepository;

    /**
     * 缓存实现
     * @return
     */
    @RequestMapping("/redis")
    public Sellervo findFoodsType(){
        /**
         * 定义一个key
         */
        String key = "foodType";
        /**
         * 未知
         */
        ValueOperations<String,Sellervo> operations = redisTemplate.opsForValue();
        /**
         * 在缓存中查询是否有这个Key的存在
         */
        boolean hasKey = redisTemplate.hasKey(key);
        /**
         * 如果存在就在缓存中寻找
         */
        if(hasKey){
            Sellervo vo = operations.get(key);
            System.out.println("在缓存中获取"+vo.toString());
            return vo;
        }
        /**
         * 如果不存在，在数据库中查询，并添加到缓存中
         */
        SellerInfo sellerInfo = sellerInfoRepository.findOne(1);
        Sellervo vo = new Sellervo();
        vo.setErrno(0);
        vo.setData(sellerInfo);
        //存到redis缓存中
        operations.set(key,vo);
        System.out.println("在数据库中获取"+vo.toString());
        return vo;
    }
}
