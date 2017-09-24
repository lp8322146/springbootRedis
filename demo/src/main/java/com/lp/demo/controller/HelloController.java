package com.lp.demo.controller;

import com.lp.demo.biz.SellerInfoBiz;
import com.lp.demo.entity.SellerInfo;
import com.lp.demo.vo.Sellervo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;


@Controller
public class HelloController {
    //自动装配
    @Autowired
    SellerInfoBiz sellerInfoBiz;

    /**
     * 组合商店信息
     * @param response
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public Sellervo findAllSellerInfo(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
        SellerInfo sellerInfo=sellerInfoBiz.findSellerInfo(1);
        sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
        sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
        sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
        sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
        sellerInfo.getInfos().add("该商家支持发票");
        sellerInfo.getInfos().add("该商家支持发票");
        sellerInfo.getInfos().add("该商家支持发票");
        sellerInfo.getInfos().add("该商家支持发票");
        Sellervo s = new Sellervo();
        s.setErrno(0);
        s.setData(sellerInfo);
        return s;
    }
}
