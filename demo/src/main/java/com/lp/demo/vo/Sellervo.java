package com.lp.demo.vo;

import com.lp.demo.entity.SellerInfo;
import lombok.Data;

import java.io.Serializable;

@Data
public class Sellervo{
    private Integer errno;
    private SellerInfo data;
}
