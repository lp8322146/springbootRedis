package com.lp.demo.dao;

import com.lp.demo.entity.FoodType;
import com.lp.demo.entity.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingsRepository extends JpaRepository<Ratings,Integer> {

}
