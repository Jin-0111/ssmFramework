package com.jyt.controller;

import com.github.pagehelper.PageInfo;
import com.jyt.entity.Employee;
import com.jyt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * TODO
 *
 * @ClassName EmployeeController
 * @description
 * @Author jyt
 * @Date 2022/9/2 10:50
 * @Version v1.0
 *  * 1.查询所有的员工信息-->/employee-->get
 *  * 1.1 查询员工分页信息-->/employee/page/{page}-->get
 *  * 2.根据id查询员工信息-->/employee/{id}-->get
 *  * 3.跳转到添加页面-->/to/add-->get
 *  * 4.添加员工信息-->/employee-->post
 *  * 5.修改员工信息-->/employee/{id}-->delete
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String getEmployeeList(Model model){
        List<Employee> employeeList = employeeService.getEmployeeList();
        model.addAttribute("list", employeeList);
        return "employee_list";
    }


    @GetMapping("/employee/page/{pageNum}")
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model) {
        //获取员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("page", page);
        return "employee_list";
    }
}

