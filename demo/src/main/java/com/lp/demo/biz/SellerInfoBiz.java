package com.lp.demo.biz;


import com.lp.demo.entity.SellerInfo;

import java.util.List;

/**
 * 商店接口
 */
public interface SellerInfoBiz {
    /**
     * 根据ID查询商店接口
     * @param id
     * @return
     */
    SellerInfo findSellerInfo(Integer id);
}
