package com.hm.service;


import com.hm.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {

    public List<Dept> list();
    public void delete(Integer id);
    public void add(Dept dept);
    public void update(Dept dept);
}
