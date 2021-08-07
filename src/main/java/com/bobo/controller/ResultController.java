package com.bobo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.base.R;
import com.bobo.entity.Result;
import com.bobo.entity.ResultVo;
import com.bobo.service.ResultService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 成绩表
 *
 * @author qniao
 * @date 2019/11/18
 */
@Api(tags="学生成绩表接口")
@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService resultService;

    /**
     * 分页查询学生成绩表
     * @param pageNo 当前页
     * @param pageSize 每页条数
     * @param result 学生成绩表
     * @return
     */
    @ApiOperation("分页查询学生成绩表")
    @GetMapping("/page")
    public R<IPage<ResultVo>> getResultPage(@ApiParam("当前页") @RequestParam(required = false, defaultValue = "1")  Long pageNo, @ApiParam("每页条数") @RequestParam(required = false, defaultValue = "10") Long pageSize, @ApiParam("查询的学生成绩表对象") Result result) {
        return new R<>(resultService.getResultPage(new Page<>(pageNo, pageSize), result));
    }

    /**
     * 通过id查询单条学生成绩表记录
     * @param id
     * @return R
     */
    @ApiOperation("通过id查询单条学生成绩表记录")
    @GetMapping("/{id}")
    public R<Result> getById(@ApiParam("学生成绩表id") @PathVariable("id") Integer id) {
        return new R<>(resultService.getById(id));
    }

    /**
     * 新增学生成绩表记录
     * @param result
     * @return R
     */
    @ApiOperation("新增学生成绩表记录")
    @PostMapping
    public R save(@ApiParam("学生成绩表对象") @RequestBody Result result) {
        return new R<>(resultService.save(result));
    }

    /**
     * 修改学生成绩表记录
     * @param result
     * @return R
     */
    @ApiOperation("修改学生成绩表记录")
    @PutMapping
    public R update(@ApiParam("学生成绩表对象") @RequestBody Result result) {
        return new R<>(resultService.updateById(result));
    }

    /**
     * 通过id删除一条学生成绩表记录
     * @param id
     * @return R
     */
    @ApiOperation("通过id删除一条学生成绩表记录")
    @DeleteMapping("/{id}")
    public R removeById(@ApiParam("学生成绩表id") @PathVariable Integer id) {
        return new R<>(resultService.removeById(id));
    }

}
