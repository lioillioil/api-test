package com.bobo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 学生表
 *
 * @author lilibo
 * @date 2019/11/18
 */
@Api("学生表")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("student")
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @ApiModelProperty("")
    @TableId
    private Integer id;

    /**
     * 学生编号
     */
    @ApiModelProperty("学生编号")
    private String no;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    private String name;

    /**
     * 地址
     */
    @ApiModelProperty("地址")
    private String address;

    /**
     * 年龄
     */
    @ApiModelProperty("年龄")
    private Integer age;

}
