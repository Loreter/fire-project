package com.fire.service.impl;

import com.fire.entity.JftVendor;
import com.fire.dao.JftVendorDao;
import com.fire.service.JftVendorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (JftVendor)表服务实现类
 *
 * @author makejava
 * @since 2020-05-17 22:34:11
 */
@Service("jftVendorService")
public class JftVendorServiceImpl implements JftVendorService {
    @Resource
    private JftVendorDao jftVendorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param vendorId 主键
     * @return 实例对象
     */
    @Override
    public JftVendor queryById(String vendorId) {
        return this.jftVendorDao.queryById(vendorId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JftVendor> queryAllByLimit(int offset, int limit) {
        return this.jftVendorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param jftVendor 实例对象
     * @return 实例对象
     */
    @Override
    public JftVendor insert(JftVendor jftVendor) {
        this.jftVendorDao.insert(jftVendor);
        return jftVendor;
    }

    /**
     * 修改数据
     *
     * @param jftVendor 实例对象
     * @return 实例对象
     */
    @Override
    public JftVendor update(JftVendor jftVendor) {
        this.jftVendorDao.update(jftVendor);
        return this.queryById(jftVendor.getVendorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param vendorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String vendorId) {
        return this.jftVendorDao.deleteById(vendorId) > 0;
    }
}