package com.fire.service;

import com.fire.entity.JftVendor;
import java.util.List;

/**
 * (JftVendor)表服务接口
 *
 * @author makejava
 * @since 2020-03-23 19:22:38
 */
public interface JftVendorService {

    /**
     * 通过ID查询单条数据
     *
     * @param vendorId 主键
     * @return 实例对象
     */
    JftVendor queryById(String vendorId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JftVendor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param jftVendor 实例对象
     * @return 实例对象
     */
    JftVendor insert(JftVendor jftVendor);

    /**
     * 修改数据
     *
     * @param jftVendor 实例对象
     * @return 实例对象
     */
    JftVendor update(JftVendor jftVendor);

    /**
     * 通过主键删除数据
     *
     * @param vendorId 主键
     * @return 是否成功
     */
    boolean deleteById(String vendorId);

}