package com.lp.demo.biz;

import com.lp.demo.entity.Ratings;

import java.util.List;

/**
 * 留言接口
 */
public interface RatingsBiz {
    /**
     * 全查留言
     * @return
     */
    List<Ratings> findAll();
}
