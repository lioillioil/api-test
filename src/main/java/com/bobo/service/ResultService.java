package com.bobo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.base.mybatis.IService;
import com.bobo.entity.Result;
import com.bobo.entity.ResultVo;

/**
 * 成绩表
 *
 * @author qniao
 * @date 2019/11/18
 */
public interface ResultService extends IService<Result> {

    /**
     * 分页查询成绩表
     * @param result 学生表
     * @return
     */
    IPage<ResultVo> getResultPage(Page<ResultVo> page, Result result);

}
