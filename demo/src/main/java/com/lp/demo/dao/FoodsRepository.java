package com.lp.demo.dao;

import com.lp.demo.entity.Foods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * foodDao层，集成JpaRepository<要操作的尸体类，该实体类的主键类型>
 */
public interface FoodsRepository extends JpaRepository<Foods,Integer> {
    /**
     * 根据类型查询food方法，
     * @param typeId
     * @return
     */
    List<Foods> findAllByTypeId(Integer typeId);
}
