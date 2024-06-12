package com.hm.controller;


import com.hm.pojo.Dept;
import com.hm.pojo.Result;
import com.hm.service.DeptService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/depts")
@RestController
@Tag(name = "部門表",description = "部門CRUD")
public class DeptController {

    @Resource
    private DeptService deptService;

    @GetMapping
    @Operation(summary = "查詢",description = "查詢部門方法")
    public Result list(){
        log.info("查詢所有部門資料");
        List<Dept> deptList =  deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "刪除",description = "刪除部門方法")
    public Result delete(@PathVariable Integer id){
        log.info("根據ID刪除部門:{}",id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    @Operation(summary = "新增",description = "新增部門方法")
    public Result add(@RequestBody Dept dept){
        log.info("新增部門: {}" , dept);
        deptService.add(dept);
        return Result.success();
    }

    @PutMapping("/update")
    @Operation(summary = "修改",description = "修改部門方法")
    public Result update(@RequestBody Dept dept){
        log.info("成功修改數據: {}",dept);
        deptService.update(dept);
        return  Result.success();
    }

}
