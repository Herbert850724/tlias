package com.hm.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hm.mapper.EmpMapper;
import com.hm.pojo.Emp;
import com.hm.pojo.PageBean;
import com.hm.service.EmpService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

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
    public PageBean page(Integer page, Integer pageSize) {

        PageHelper.startPage(page,pageSize);
        List<Emp> empList = empMapper.selectAll();
        Page<Emp> p = (Page<Emp>) empList;

        PageBean pageBean = new PageBean(p.getTotal(),p.getResult());

        return pageBean;
    }

}
