package com.lp.demo;

import com.lp.demo.biz.FoodsBiz;
import com.lp.demo.controller.RedisController;
import com.lp.demo.dao.FoodTypeRepository;
import com.lp.demo.dao.FoodsRepository;
import com.lp.demo.dao.RatingsRepository;
import com.lp.demo.dao.SellerInfoRepository;
import com.lp.demo.dao.mapper.SellerInfoMapper;
import com.lp.demo.entity.FoodType;
import com.lp.demo.entity.Foods;
import com.lp.demo.entity.Ratings;
import com.lp.demo.entity.SellerInfo;
import com.lp.demo.vo.FoodsVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	FoodTypeRepository foodTypeRepository;
	@Autowired
	FoodsRepository foodsRepository;
	@Autowired
	RatingsRepository ratingsRepository;
	@Autowired
	SellerInfoRepository sellerInfoRepository;
	@Autowired
	SellerInfoMapper sellerInfoMapper;
	@Autowired
    RedisController foodTypeController;
	@Autowired
	FoodsBiz foodsBiz;
	@Test
	public void TestPage(){
		PageRequest pageRequest = new PageRequest(2,1);
		Page<Foods> foods=foodsRepository.findAll(pageRequest);
		foods.forEach(a -> System.out.println(a.getName()+a.getId()));
	}
	@Test
	public void Test(){
		foodTypeController.findFoodsType();
	}
    /**
     * MyBatis删除方法操作表为FoodType
     */
	@Test
	public void deleteFoodType(){
        System.out.println(sellerInfoMapper.deletefoodType(2));
    }
    /**
     * MyBatis修改方法操作表为FoodType
     */
	@Test
	public void updateFoodType(){
        FoodType foodType = new FoodType();
        foodType.setType(2);
        foodType.setName("c榜");
        System.out.println(sellerInfoMapper.updateSelleInfo(foodType));
    }
    /**
     * MyBatis新增方法操作表为FoodType
     */
	@Test
	public void insertFoodType(){
        int i = sellerInfoMapper.save("a榜");
        System.out.println(i);
    }
    /**
     * MyBatis查询方法操作表为SellerInfo
     */
	@Test
	public void findFoodType(){
		SellerInfo sellerInfo = sellerInfoMapper.findFoodType();
		System.out.println(sellerInfo.toString());
	}

    /**
     * Jpa新增方法操作表为Ratings
     */
	@Test
	public void addRatings(){
		Ratings r = new Ratings();
		r.setUsername("9******0");
		r.setRateTime(146924196);
		r.setDeliveryTime(70);
		r.setScore(1);
		r.setRateType(1);
		r.setText("送货速度蜗牛一样");
		r.setAvatar("http://static.galileo.xiaojukeji.com/static/tms/default_header.png");
		ratingsRepository.save(r);
	}

    /**
     * Jpa新增方法操作表为SellerInfo
     */
	@Test
	public void contextLoads() {
		SellerInfo sellerInfo = new SellerInfo();
		sellerInfo.setName("粥品香坊（回龙观）");
		sellerInfo.setDescription("蜂鸟专送");
		sellerInfo.setDeliveryTime(38);
		sellerInfo.setScore(4.2);
		sellerInfo.setServiceScore(4.1);
		sellerInfo.setFoodScore(4.3);
		sellerInfo.setRankRate(69.2);
		sellerInfo.setMinPrice(20);
		sellerInfo.setDeliveryPrice(4);
		sellerInfo.setRatingCount(24);
		sellerInfo.setSellCount(90);
		sellerInfo.setBulletin("粥品香坊其烹饪粥料的秘方源于中国千年古法，在融和现代制作工艺，由世界烹饪大师屈浩先生领衔研发。坚守纯天然、0添加的良心品质深得消费者青睐，发展至今成为粥类的引领品牌。是2008年奥运会和2013年园博会指定餐饮服务商。");
		sellerInfo.setAvatar("http://static.galileo.xiaojukeji.com/static/tms/seller_avatar_256px.jpg");
		sellerInfoRepository.save(sellerInfo);
	}
    /**
     * Jpa新增方法操作表为FoodType
     */
	@Test
	public void addFoodType(){
		FoodType foodType = new FoodType();
		foodType.setName("单人精彩套餐");
		foodTypeRepository.save(foodType);
		foodType.setName("冰爽饮品限时特惠");
		foodTypeRepository.save(foodType);
		foodType.setName("精选热菜");
		foodTypeRepository.save(foodType);
		foodType.setName("爽口凉菜");
		foodTypeRepository.save(foodType);
		foodType.setName("精彩套餐");
		foodTypeRepository.save(foodType);
		foodType.setName("果汁");
		foodTypeRepository.save(foodType);
	}

    /**
     * Jpa新增方法操作表为Foods
     */
	@Test
	public void addFoods(){
		Foods foods = new Foods();
		foods.setName("VC无限橙果汁");
		foods.setPrice(8);
		foods.setOldPrice("10");
		foods.setDescription("");
		foods.setSellCount(15);
		foods.setRating(100);
		foods.setTypeId(3);
		foods.setInfo("");
		foods.setIcon("http://fuss10.elemecdn.com/e/c6/f348e811772016ae24e968238bcbfjpeg.jpeg?imageView2/1/w/114/h/114");
		foods.setImage("http://fuss10.elemecdn.com/e/c6/f348e811772016ae24e968238bcbfjpeg.jpeg?imageView2/1/w/750/h/750");
		foodsRepository.save(foods);

	}

    /**
     * Jpa查询方法操作表为Foods
     */
	@Test
	public void findFoodsByTypeId(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<Foods> foods= foodsRepository.findAllByTypeId(1);
		for (int i = 0; i<foods.size();i++){
			System.out.println(foods.get(i).toString());
		}
	}

    /**
     * 查询Foods表，查询出为Vo封装对象
     */
	@Test
	public void endTest(){
		FoodsVo vo = new FoodsVo();
		vo.setErrno(0);
		List<FoodType> foodTypes = foodTypeRepository.findAll();
		for (int i = 0; i<foodTypes.size();i++){
			List<Foods> foods = foodsRepository.findAllByTypeId(foodTypes.get(i).getType());
			foodTypes.get(i).setFoods(foods);
		}
		vo.setData(foodTypes);
		String str = vo.toString();
		System.out.println(vo.toString());
	}
}
