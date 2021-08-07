package com.bobo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.base.mybatis.impl.ServiceImpl;
import com.bobo.entity.Result;
import com.bobo.entity.ResultVo;
import com.bobo.mapper.ResultMapper;
import com.bobo.service.ResultService;
import org.springframework.stereotype.Service;

/**
 * 学生表
 *
 * @author qniao
 * @date 2019/11/18
 */
@Service
public class ResultServiceImpl extends ServiceImpl<ResultMapper, Result> implements ResultService {

    /**
    * 分页查询学生表
    * @param result 学生表
    * @return
    */
    @Override
    public IPage<ResultVo> getResultPage(Page<ResultVo> page, Result result) {
        return baseMapper.getResultPage(page, result);
    }

}
