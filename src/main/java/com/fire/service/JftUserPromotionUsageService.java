package com.fire.service;

import com.fire.entity.JftUserPromotionUsage;
import java.util.List;

/**
 * 用户优惠活动使用情况表(JftUserPromotionUsage)表服务接口
 *
 * @author makejava
 * @since 2020-04-11 22:35:14
 */
public interface JftUserPromotionUsageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    JftUserPromotionUsage queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JftUserPromotionUsage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param jftUserPromotionUsage 实例对象
     * @return 实例对象
     */
    JftUserPromotionUsage insert(JftUserPromotionUsage jftUserPromotionUsage);

    /**
     * 修改数据
     *
     * @param jftUserPromotionUsage 实例对象
     * @return 实例对象
     */
    JftUserPromotionUsage update(JftUserPromotionUsage jftUserPromotionUsage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}