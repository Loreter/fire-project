package com.fire.controller;

import com.fire.entity.JftVendor;
import com.fire.service.JftVendorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (JftVendor)表控制层
 *
 * @author makejava
 * @since 2020-05-17 22:34:11
 */
@RestController
@RequestMapping("jftVendor")
public class JftVendorController {
    /**
     * 服务对象
     */
    @Resource
    private JftVendorService jftVendorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public JftVendor selectOne(String id) {
        return this.jftVendorService.queryById(id);
    }

}