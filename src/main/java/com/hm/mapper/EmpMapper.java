package com.hm.mapper;

import com.hm.pojo.Emp;
import tk.mybatis.mapper.common.Mapper;

public interface EmpMapper extends Mapper<Emp> {

//    //傳統寫法
//    @Select("select count(*) from emp")
//    public Long count();
//
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(Integer start,Integer pageSize);


    //PageHelper

}
