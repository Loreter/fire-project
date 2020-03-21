package com.fire.controller;

import com.fire.entity.Employee;
import com.fire.entity.JftVendorWhiteDetail;
import com.fire.service.EmployeeService;
import com.fire.service.JftVendorWhiteDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

/**
 * 商户白名单详情表(JftVendorWhiteDetail)表控制层
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
@Controller
@RequestMapping("jftVendorWhiteDetail")
public class JftVendorWhiteDetailController {
    /**
     * 服务对象
     */
    @Resource
    private JftVendorWhiteDetailService jftVendorWhiteDetailService;

    @Resource
    private EmployeeService employeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public JftVendorWhiteDetail selectOne(@PathVariable("id") BigInteger id) {
        return this.jftVendorWhiteDetailService.queryById(id);
    }

    /**
     * 查询全部数据
     *
     * @return 数据集合
     */
    @RequestMapping("/all")
    public String queryAll(Model model) {
        List<JftVendorWhiteDetail> list = jftVendorWhiteDetailService.queryAll();
        model.addAttribute("list",list);
        return "vendor/vendorList";
    }

    @RequestMapping("/list")
    public String queryList(Model model){

        List<Employee> employees = employeeService.queryAllByLimit(1, 10);
        model.addAttribute("employees",employees);
        return "vendor/empolyeeList";
    }
}