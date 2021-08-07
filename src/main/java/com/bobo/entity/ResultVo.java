package com.bobo.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 学生成绩VO
 *
 * @author lilibo
 * @date 2019/11/18
 */
@Api("学生成绩VO")
@Data
@EqualsAndHashCode(callSuper = true)
public class ResultVo extends Model<ResultVo> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ApiModelProperty("")
    private Integer id;

    /**
     * 学生编号
     */
    @ApiModelProperty("学生编号")
    private Integer studentId;

    /**
     * 学生姓名
     */
    @ApiModelProperty("学生姓名")
    private String studentName;

    /**
     * 科目编号
     */
    @ApiModelProperty("科目编号")
    private Integer subjectId;

    /**
     * 科目名称
     */
    @ApiModelProperty("科目名称")
    private String subjectName;

    /**
     * 成绩
     */
    @ApiModelProperty("成绩")
    private Integer score;

}
