package com.lp.demo.biz.impl;

import com.lp.demo.biz.RatingsBiz;
import com.lp.demo.dao.RatingsRepository;
import com.lp.demo.entity.Ratings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 店家业务层
 */
@Service
public class RatingsBizImpl implements RatingsBiz {
    //自动装配
    @Autowired
    RatingsRepository ratingsRepository;

    /**
     * 全查留言表
     * @return
     */
    @Override
    public List<Ratings> findAll() {
        List<Ratings> list = ratingsRepository.findAll();
        return list;
    }
}
