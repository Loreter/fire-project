package com.fire.service.impl;

import com.fire.mapper.JftVendorWhiteDetailDao;
import com.fire.entity.JftVendorWhiteDetail;
import com.fire.service.JftVendorWhiteDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

/**
 * 商户白名单详情表(JftVendorWhiteDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
@Service("jftVendorWhiteDetailService")
public class JftVendorWhiteDetailServiceImpl implements JftVendorWhiteDetailService {
    @Resource
    private JftVendorWhiteDetailDao jftVendorWhiteDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param logicId 主键
     * @return 实例对象
     */
    @Override
    public JftVendorWhiteDetail queryById(BigInteger logicId) {
        return this.jftVendorWhiteDetailDao.queryById(logicId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JftVendorWhiteDetail> queryAllByLimit(int offset, int limit) {
        return this.jftVendorWhiteDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param jftVendorWhiteDetail 实例对象
     * @return 实例对象
     */
    @Override
    public JftVendorWhiteDetail insert(JftVendorWhiteDetail jftVendorWhiteDetail) {
        this.jftVendorWhiteDetailDao.insert(jftVendorWhiteDetail);
        return jftVendorWhiteDetail;
    }

    /**
     * 修改数据
     *
     * @param jftVendorWhiteDetail 实例对象
     * @return 实例对象
     */
    @Override
    public JftVendorWhiteDetail update(JftVendorWhiteDetail jftVendorWhiteDetail) {
        this.jftVendorWhiteDetailDao.update(jftVendorWhiteDetail);
        return this.queryById(jftVendorWhiteDetail.getLogicId());
    }

    /**
     * 通过主键删除数据
     *
     * @param logicId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(BigInteger logicId) {
        return this.jftVendorWhiteDetailDao.deleteById(logicId) > 0;
    }

    @Override
    public List<JftVendorWhiteDetail> queryAll() {
        return jftVendorWhiteDetailDao.queryAllByLimit(1,1000);
    }
}