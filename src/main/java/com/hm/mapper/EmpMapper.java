package com.hm.mapper;

import com.hm.pojo.Emp;
import tk.mybatis.mapper.common.Mapper;

import java.time.LocalDate;
import java.util.List;

public interface EmpMapper extends Mapper<Emp> {

//    //傳統寫法
//    @Select("select count(*) from emp")
//    public Long count();
//
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(Integer start,Integer pageSize);


    //PageHelper

    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    public void deleteId(List<Integer> ids);

    public void update(Emp emp);
}
