package com.lp.demo.dao.mapper;

import com.lp.demo.entity.FoodType;
import com.lp.demo.entity.SellerInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface SellerInfoMapper {
    /**
     * @Results 如果实体类属性名和数据库列名不一致，
     * 用property表示属性名
     * column表示数据库列名
     * 将他俩进行匹配
     * @Select 查询方法
     * @return
     */
   /* @Results({
            @Result(property = "userId",column = "id")
    })*/
    @Select("select * from seller_info where id=1")
    SellerInfo findFoodType();

    /**
     * @Insert 新增方法
     * 如果需要参数注入
     * 在方法参数中使用@Param("XXX")
     * 与#{XXX}一致，进行参数传递
     * @param name
     * @return
     */
    @Insert("insert into food_Type(name) values (#{val})")
    int save(@Param("val") String name);

    /**
     * @Update修改方法
     *可以使用对象作为参数，#{name}必须和实体类的属性名一致
     * @param name
     * @return
     */
    @Update("update food_Type set name=#{name} where type=#{type}")
    int updateSelleInfo(FoodType foodType);

    /**
     *@Delete删除方法
     * @param id
     * @return
     */
    @Delete("delete from food_Type where type=#{id}")
    int deletefoodType(@Param("id") int id);
}
