package com.lp.demo.controller;

import com.lp.demo.biz.RatingsBiz;
import com.lp.demo.entity.Ratings;
import com.lp.demo.vo.RatingsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 留言控制层
 */
@RestController
public class RatingsController {
    //自动装配
    @Autowired
    RatingsBiz ratingsBiz;

    /**
     * 装配留言VO
     * @param response
     * @return
     */
    @RequestMapping("/findRating")
    public RatingsVo findRating(HttpServletResponse response){
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin","*");
        RatingsVo vo = new RatingsVo();
        vo.setErrno(0);
        List<Ratings> list= ratingsBiz.findAll();
        vo.setData(list);
        return vo;
    }

}
