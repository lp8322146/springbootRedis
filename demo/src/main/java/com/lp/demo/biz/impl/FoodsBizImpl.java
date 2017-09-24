package com.lp.demo.biz.impl;

import com.lp.demo.biz.FoodsBiz;
import com.lp.demo.dao.FoodsRepository;
import com.lp.demo.entity.Foods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Pageable;
import java.util.List;

/**
 * 商品业务层
 */
@Service
public class FoodsBizImpl implements FoodsBiz {
    //自动装配
    @Autowired
    FoodsRepository foodsRepository;

    /**
     * 根据Id获取商品
     * @param id
     * @return
     */
    @Override
    public List<Foods> findAllFoods(Integer id) {
        List<Foods> foods=foodsRepository.findAllByTypeId(id);
        return foods;
    }

    /**
     * 分页查询商品
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<Foods> findAllByPage(Integer page,Integer size) {
        PageRequest pageRequest = new PageRequest(page,size);
        Page<Foods> foods=foodsRepository.findAll(pageRequest);
        return foods;
    }

    @Override
    public List<Foods> findAll() {
        List<Foods> list=foodsRepository.findAll();
        return list;
    }
}
