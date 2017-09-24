package com.lp.demo.biz;

import com.lp.demo.entity.Foods;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

/**
 * 商品接口
 */
public interface FoodsBiz {
    /**
     * 根据ID查询
     * @param id
     * @return
     */
    List<Foods>    findAllFoods(Integer id);

    /**
     * 分页查询
     * @return
     */
    Page<Foods> findAllByPage(Integer page,Integer size);

    /**
     * 全查
     * @return
     */
    List<Foods> findAll();
}
