package com.lp.demo.dao;

import com.lp.demo.entity.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodTypeRepository extends JpaRepository<FoodType,Integer> {
}
