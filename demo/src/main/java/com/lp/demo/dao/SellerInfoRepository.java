package com.lp.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.lp.demo.entity.SellerInfo;
public interface SellerInfoRepository extends JpaRepository<SellerInfo,Integer> {

}
