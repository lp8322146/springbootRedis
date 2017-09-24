package com.lp.demo.controller;

import com.lp.demo.biz.FoodTyepBiz;
import com.lp.demo.biz.FoodsBiz;
import com.lp.demo.biz.RatingsBiz;
import com.lp.demo.entity.FoodType;
import com.lp.demo.entity.Foods;
import com.lp.demo.entity.Ratings;
import com.lp.demo.vo.FoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * 商品控制层
 */
@RestController
public class FoodsController {
    //自动装配
    @Autowired
    FoodsBiz foodsBiz;
    @Autowired
    FoodTyepBiz foodTyepBiz;
    @Autowired
    RatingsBiz ratingsBiz;

    /**
     * 组合商品VO
     * @param response
     * @return返回一个商品VO
     */
    @RequestMapping("/getAll")
    public FoodsVo getFoods(HttpServletResponse response){
        /**
         * first:vo
         * next:foodType
         * next:foods
         * next:rationgs
         */
        response.setHeader("Access-Control-Allow-Origin","*");
        FoodsVo vo = new FoodsVo();
        vo.setErrno(0);
        List<FoodType> foodTypes = foodTyepBiz.findAllFoodType();
        for (int i = 0; i<foodTypes.size();i++){
            List<Foods> foods = foodsBiz.findAllFoods(foodTypes.get(i).getType());

            foodTypes.get(i).setFoods(foods);
        }
        vo.setData(foodTypes);

        return vo;
    }

}
