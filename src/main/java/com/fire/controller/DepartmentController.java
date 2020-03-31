package com.fire.controller;

import com.fire.entity.Department;
import com.fire.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Department)表控制层
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
@Controller
@RequestMapping("department")
@Api(value = "DepartmentController")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentService departmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Department selectOne(Integer id) {
        return this.departmentService.queryById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getUserName", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户编号获取用户姓名", notes = "test: 仅1和2有正确返回")
    @ApiImplicitParam(paramType = "query", name = "userNumber", value = "用户编号", required = true, dataType = "Integer")
    public String getUserName(@RequestParam Integer userNumber) {
        if (userNumber == 1) {
            return "张三丰";
        } else if (userNumber == 2) {
            return "慕容复";
        } else {
            return "未知";
        }
    }
}