package com.hm.service;


import com.hm.pojo.PageBean;

/**
 * 员工管理
 */
public interface EmpService {

    public PageBean page(Integer page,Integer pageSize);
}
