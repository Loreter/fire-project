package com.fire.service;

import com.fire.entity.JftVendorWhiteDetail;

import java.math.BigInteger;
import java.util.List;

/**
 * 商户白名单详情表(JftVendorWhiteDetail)表服务接口
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
public interface JftVendorWhiteDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param logicId 主键
     * @return 实例对象
     */
    JftVendorWhiteDetail queryById(BigInteger logicId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JftVendorWhiteDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param jftVendorWhiteDetail 实例对象
     * @return 实例对象
     */
    JftVendorWhiteDetail insert(JftVendorWhiteDetail jftVendorWhiteDetail);

    /**
     * 修改数据
     *
     * @param jftVendorWhiteDetail 实例对象
     * @return 实例对象
     */
    JftVendorWhiteDetail update(JftVendorWhiteDetail jftVendorWhiteDetail);

    /**
     * 通过主键删除数据
     *
     * @param logicId 主键
     * @return 是否成功
     */
    boolean deleteById(BigInteger logicId);

    /**
     * 查询全部数据
     * @return
     */
    List<JftVendorWhiteDetail> queryAll();
}