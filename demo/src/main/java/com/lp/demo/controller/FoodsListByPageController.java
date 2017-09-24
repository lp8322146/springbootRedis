package com.lp.demo.controller;

import com.lp.demo.biz.FoodsBiz;
import com.lp.demo.dao.FoodsRepository;
import com.lp.demo.entity.Foods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 商品分页控制层
 */
@Controller
public class FoodsListByPageController {
    //自动装配
    @Autowired
    FoodsBiz foodsBiz;

    /**
     * 进行页面跳转
     * @param response
     * @return
     */
    @RequestMapping("/page")
    public String page(HttpServletResponse response){
        System.out.println("页面跳转");
        return "redirect:foodsListPage";
    }

    /**
     * 分页展示
     * @param page
     * @param request
     * @return
     */
    @RequestMapping("/foodsListPage")
    public String FoodsListPage(Integer page,HttpServletRequest request){
        System.out.println("page 值为"+page);
        if(null==page){
            page=1;
        }
        Page<Foods> foods=foodsBiz.findAllByPage(page-1,2);
      /*  List<Foods> foods = foodsBiz.findAll();*/
        request.setAttribute("foodList",foods);
        request.setAttribute("page",page);
        return "FoodList";
    }
}
