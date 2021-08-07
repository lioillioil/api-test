package com.bobo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.base.mybatis.IMapper;
import com.bobo.entity.Result;
import com.bobo.entity.ResultVo;
import org.apache.ibatis.annotations.Param;

/**
 * 成绩表
 *
 * @author qniao
 * @date 2019/11/18
 */
public interface ResultMapper extends IMapper<Result> {

    /**
      * 分页查询学生表
      * @param result 学生表
      * @return
      */
    IPage<ResultVo> getResultPage(Page page, @Param("result") Result result);

}
