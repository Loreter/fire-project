package com.fire.mapper;

import com.fire.entity.JftVendorWhiteDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * 商户白名单详情表(JftVendorWhiteDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-19 21:13:32
 */
@Mapper
@Repository
public interface JftVendorWhiteDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param logicId 主键
     * @return 实例对象
     */
    JftVendorWhiteDetail queryById(BigInteger logicId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JftVendorWhiteDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param jftVendorWhiteDetail 实例对象
     * @return 对象列表
     */
    List<JftVendorWhiteDetail> queryAll(JftVendorWhiteDetail jftVendorWhiteDetail);

    /**
     * 新增数据
     *
     * @param jftVendorWhiteDetail 实例对象
     * @return 影响行数
     */
    int insert(JftVendorWhiteDetail jftVendorWhiteDetail);

    /**
     * 修改数据
     *
     * @param jftVendorWhiteDetail 实例对象
     * @return 影响行数
     */
    int update(JftVendorWhiteDetail jftVendorWhiteDetail);

    /**
     * 通过主键删除数据
     *
     * @param logicId 主键
     * @return 影响行数
     */
    int deleteById(BigInteger logicId);

}