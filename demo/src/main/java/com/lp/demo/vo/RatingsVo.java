package com.lp.demo.vo;

import com.lp.demo.entity.Ratings;
import lombok.Data;

import java.util.List;

@Data
public class RatingsVo {
    private int errno;
    private List<Ratings> data;
}
