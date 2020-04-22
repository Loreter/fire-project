package com.fire.service.impl;

import com.fire.entity.JftVendor;
import com.fire.mapper.JftVendorDao;
import com.fire.service.JftVendorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * (JftVendor)表服务实现类
 *
 * @author makejava
 * @since 2020-03-23 19:22:38
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

    public static void main(String[] args) {
        try {
            Date date = new Date();
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2020-04-15");

            System.out.println(date.after(parse));
            System.out.println(date.before(parse));


        } catch (ParseException e) {
            e.printStackTrace();
        }

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