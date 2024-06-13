package com.hm.service;


import com.hm.pojo.Emp;
import com.hm.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
public interface EmpService {

    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin,LocalDate end);

    public void deleteId(List<Integer> ids);

    public void save(Emp emp);

    public Emp getById(Integer id);

    public void update(Emp emp);
}
