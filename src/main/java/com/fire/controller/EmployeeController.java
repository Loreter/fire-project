package com.fire.controller;

import com.fire.entity.Employee;
import com.fire.service.EmployeeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Employee)表控制层
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
@Controller
//@RestController
@RequestMapping("employee")
@Api(value = "EmployeeController")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;

    @Autowired(required = false)
    LocaleResolver localeResolver;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Employee selectOne(@PathVariable("id") Integer id) {
        return this.employeeService.queryById(id);
    }


    @RequestMapping("/queryList")
    public List<Employee> queryList(Model model){

        List<Employee> employees = employeeService.queryAllByLimit(1, 10);
        model.addAttribute("employees",employees);
//        return "vendor/employeeList";
        return employees;
    }

    @RequestMapping("/all")
    public String queryAll(Model model){
        List<Employee> employees = employeeService.queryAllByLimit(1, 10);
        model.addAttribute("employees",employees);
        return "vendor/empolyeeList";
    }

}