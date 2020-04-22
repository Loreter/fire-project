package com.fire.mapper;

import com.fire.entity.JftVendor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (JftVendor)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-23 19:22:38
 */
@Mapper
@Repository
public interface JftVendorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param vendorId 主键
     * @return 实例对象
     */
    JftVendor queryById(String vendorId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JftVendor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param jftVendor 实例对象
     * @return 对象列表
     */
    List<JftVendor> queryAll(JftVendor jftVendor);

    /**
     * 新增数据
     *
     * @param jftVendor 实例对象
     * @return 影响行数
     */
    int insert(JftVendor jftVendor);

    /**
     * 修改数据
     *
     * @param jftVendor 实例对象
     * @return 影响行数
     */
    int update(JftVendor jftVendor);

    /**
     * 通过主键删除数据
     *
     * @param vendorId 主键
     * @return 影响行数
     */
    int deleteById(String vendorId);

}