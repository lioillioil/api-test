package com.bobo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.base.mybatis.impl.ServiceImpl;
import com.bobo.entity.Student;
import com.bobo.mapper.StudentMapper;
import com.bobo.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * 学生表
 *
 * @author qniao
 * @date 2019/11/18
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    /**
    * 分页查询学生表
    * @param student 学生表
    * @return
    */
    @Override
    public IPage<Student> getStudentPage(Page<Student> page, Student student) {
        return baseMapper.getStudentPage(page, student);
    }

}
