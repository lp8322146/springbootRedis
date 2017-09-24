package com.lp.demo.biz.impl;

import com.lp.demo.biz.SellerInfoBiz;
import com.lp.demo.dao.SellerInfoRepository;
import com.lp.demo.entity.SellerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component("sellerInfoBiz")
public class SellerInfoBizImpl implements SellerInfoBiz {
    /**
     * 自动装配
     */
    @Autowired
    SellerInfoRepository sellerInfoRepository;

    /**
     * 根据id查询商店信息
     * @param id
     * @return
     */
    @Override
    public SellerInfo findSellerInfo(Integer id) {
        return sellerInfoRepository.findOne(id);
    }

}
