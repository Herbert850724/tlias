package com.hm.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hm.mapper.EmpMapper;
import com.hm.pojo.Emp;
import com.hm.pojo.PageBean;
import com.hm.service.EmpService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpMapper empMapper;

//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//        Long count = empMapper.count();
//        List<Emp> empList = empMapper.page((page - 1) * pageSize, pageSize);
//
//        PageBean pageBean = new PageBean(count,empList);
//        return pageBean;
//    }

    //PageHelper
    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {

        PageHelper.startPage(page,pageSize);
        List<Emp> empList = empMapper.list(name,gender,begin,end);
        Page<Emp> p = (Page<Emp>) empList;

        PageBean pageBean = new PageBean(p.getTotal(),p.getResult());

        return pageBean;

    }

    @Override
    public void deleteId(List<Integer> ids) {
        empMapper.deleteId(ids);
    }

    @Override
    public void save(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insertSelective(emp);
    }

    @Override
    public Emp getById(Integer id) {
        Emp emp = empMapper.selectByPrimaryKey(id);
        return emp;
    }

    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        //empMapper.update(emp);
        empMapper.updateByPrimaryKeySelective(emp);

    }


}
