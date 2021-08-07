package com.bobo.base.mybatis.impl;

import com.bobo.base.mybatis.IMapper;
import com.bobo.base.mybatis.IService;

/**
 * Service层的父类，实现了基本的CRUD的封装
 *
 * @author lilibo
 * @date 2019/9/20
 */

public abstract class ServiceImpl<M extends IMapper<T>, T> extends com.baomidou.mybatisplus.extension.service.impl.ServiceImpl<M, T> implements IService<T> {

}
