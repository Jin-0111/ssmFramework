package com.jyt.service;

import com.github.pagehelper.PageInfo;
import com.jyt.entity.Employee;

import java.util.List;

/**
 * TODO
 *
 * @ClassName EmployeeService
 * @description
 * @Author jyt
 * @Date 2022/9/2 10:50
 * @Version v1.0
 */
public interface EmployeeService {

    List<Employee> getEmployeeList();

    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
