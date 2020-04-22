package com.fire.service.impl;

import com.fire.entity.JftUserPromotionUsage;
import com.fire.mapper.JftUserPromotionUsageDao;
import com.fire.service.JftUserPromotionUsageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户优惠活动使用情况表(JftUserPromotionUsage)表服务实现类
 *
 * @author makejava
 * @since 2020-04-11 22:35:14
 */
@Service("jftUserPromotionUsageService")
public class JftUserPromotionUsageServiceImpl implements JftUserPromotionUsageService {
    @Resource
    private JftUserPromotionUsageDao jftUserPromotionUsageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public JftUserPromotionUsage queryById(Long id) {
        return this.jftUserPromotionUsageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JftUserPromotionUsage> queryAllByLimit(int offset, int limit) {
        return this.jftUserPromotionUsageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param jftUserPromotionUsage 实例对象
     * @return 实例对象
     */
    @Override
    public JftUserPromotionUsage insert(JftUserPromotionUsage jftUserPromotionUsage) {
        this.jftUserPromotionUsageDao.insert(jftUserPromotionUsage);
        return jftUserPromotionUsage;
    }

    /**
     * 修改数据
     *
     * @param jftUserPromotionUsage 实例对象
     * @return 实例对象
     */
    @Override
    public JftUserPromotionUsage update(JftUserPromotionUsage jftUserPromotionUsage) {
        this.jftUserPromotionUsageDao.update(jftUserPromotionUsage);
        return this.queryById(jftUserPromotionUsage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.jftUserPromotionUsageDao.deleteById(id) > 0;
    }


    public JftUserPromotionUsage selectA(JftUserPromotionUsage userPromotionUsage){
//        return this.jftUserPromotionUsageDao?
                return new JftUserPromotionUsage();
    }
}