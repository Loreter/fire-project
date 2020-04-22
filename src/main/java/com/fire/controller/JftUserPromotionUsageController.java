package com.fire.controller;

import com.fire.entity.JftUserPromotionUsage;
import com.fire.service.JftUserPromotionUsageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户优惠活动使用情况表(JftUserPromotionUsage)表控制层
 *
 * @author makejava
 * @since 2020-04-11 22:35:14
 */
@RestController
@RequestMapping("jftUserPromotionUsage")
public class JftUserPromotionUsageController {
    /**
     * 服务对象
     */
    @Resource
    private JftUserPromotionUsageService jftUserPromotionUsageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public JftUserPromotionUsage selectOne(Long id) {
        return this.jftUserPromotionUsageService.queryById(id);
    }

}