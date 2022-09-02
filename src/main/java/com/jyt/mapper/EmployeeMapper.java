package com.jyt.mapper;

import com.github.pagehelper.PageInfo;
import com.jyt.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> getEmployeeList();

}