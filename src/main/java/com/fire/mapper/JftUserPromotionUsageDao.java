package com.fire.mapper;

import com.fire.entity.JftUserPromotionUsage;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户优惠活动使用情况表(JftUserPromotionUsage)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-11 22:35:14
 */
public interface JftUserPromotionUsageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    JftUserPromotionUsage queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JftUserPromotionUsage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param jftUserPromotionUsage 实例对象
     * @return 对象列表
     */
    List<JftUserPromotionUsage> queryAll(JftUserPromotionUsage jftUserPromotionUsage);

    /**
     * 新增数据
     *
     * @param jftUserPromotionUsage 实例对象
     * @return 影响行数
     */
    int insert(JftUserPromotionUsage jftUserPromotionUsage);

    /**
     * 修改数据
     *
     * @param jftUserPromotionUsage 实例对象
     * @return 影响行数
     */
    int update(JftUserPromotionUsage jftUserPromotionUsage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}