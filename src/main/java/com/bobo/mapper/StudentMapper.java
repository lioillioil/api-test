package com.bobo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.entity.Student;
import com.bobo.base.mybatis.IMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 学生表
 *
 * @author qniao
 * @date 2019/11/18
 */
public interface StudentMapper extends IMapper<Student> {

    /**
      * 分页查询学生表
      * @param student 学生表
      * @return
      */
    IPage<Student> getStudentPage(Page page, @Param("student") Student student);

}
