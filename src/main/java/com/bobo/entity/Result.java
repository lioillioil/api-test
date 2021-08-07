package com.bobo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 成绩表
 *
 * @author lilibo
 * @date 2019/11/18
 */
@Api("成绩表")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("result")
public class Result extends Model<Result> {

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
    private Integer studentId;

    /**
     * 成绩
     */
    @ApiModelProperty("成绩")
    private Integer score;

}
