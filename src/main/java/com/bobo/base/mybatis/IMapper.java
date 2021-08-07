package com.bobo.base.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * Mapper层的父类接口，实现了基本的CRUD的封装
 *
 * @param <T> 数据对象实体
 * @author lilibo
 * @date 2019/9/20
 */
public interface IMapper<T> extends BaseMapper<T> {

}
