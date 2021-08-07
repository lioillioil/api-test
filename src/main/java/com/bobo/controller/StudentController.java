package com.bobo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.base.R;
import com.bobo.entity.Student;
import com.bobo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 学生表
 *
 * @author qniao
 * @date 2019/11/18
 */
@Api(tags="学生表接口")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 分页查询学生表
     * @param pageNo 当前页
     * @param pageSize 每页条数
     * @param student 学生表
     * @return
     */
    @ApiOperation("分页查询学生表")
    @GetMapping("/page")
    public R<IPage<Student>> getStudentPage(@ApiParam("当前页") @RequestParam(required = false, defaultValue = "1")  Long pageNo, @ApiParam("每页条数") @RequestParam(required = false, defaultValue = "10") Long pageSize, @ApiParam("查询的学生表对象") Student student) {
        return new R<>(studentService.getStudentPage(new Page<>(pageNo, pageSize), student));
    }

    /**
     * 通过id查询单条学生表记录
     * @param id
     * @return R
     */
    @ApiOperation("通过id查询单条学生表记录")
    @GetMapping("/{id}")
    public R<Student> getById(@ApiParam("学生表id") @PathVariable("id") Integer id) {
        return new R<>(studentService.getById(id));
    }

    /**
     * 新增学生表记录
     * @param student
     * @return R
     */
    @ApiOperation("新增学生表记录")
    @PostMapping
    public R save(@ApiParam("学生表对象") @RequestBody Student student) {
        return new R<>(studentService.save(student));
    }

    /**
     * 修改学生表记录
     * @param student
     * @return R
     */
    @ApiOperation("修改学生表记录")
    @PutMapping
    public R update(@ApiParam("学生表对象") @RequestBody Student student) {
        return new R<>(studentService.updateById(student));
    }

    /**
     * 通过id删除一条学生表记录
     * @param id
     * @return R
     */
    @ApiOperation("通过id删除一条学生表记录")
    @DeleteMapping("/{id}")
    public R removeById(@ApiParam("学生表id") @PathVariable Integer id) {
        return new R<>(studentService.removeById(id));
    }

}
