package com.hm.service.impl;


import com.hm.mapper.DeptMapper;
import com.hm.pojo.Dept;
import com.hm.service.DeptService;
import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.selectAll();
    }

    @Override
    public void delete(Integer id) {
        deptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insertSelective(dept);
    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.updateByPrimaryKeySelective(dept);
    }


}
