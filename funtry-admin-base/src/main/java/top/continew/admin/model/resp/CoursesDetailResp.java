package top.continew.admin.model.resp;

import java.io.Serial;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;

import top.continew.starter.extension.crud.model.resp.BaseDetailResp;

/**
 * 课程详情信息
 *
 * @author funtry
 * @since 2024/10/13 13:18
 */
@Data
@ExcelIgnoreUnannotated
@Schema(description = "课程详情信息")
public class CoursesDetailResp extends BaseDetailResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 课程所属教师
     */
    @Schema(description = "课程所属教师")
    @ExcelProperty(value = "课程所属教师")
    private Long userId;

    /**
     * 课程名称
     */
    @Schema(description = "课程名称")
    @ExcelProperty(value = "课程名称")
    private String courseName;

    /**
     * 课程介绍
     */
    @Schema(description = "课程介绍")
    @ExcelProperty(value = "课程介绍")
    private String courseDesc;

    /**
     * 课程所属院系
     */
    @Schema(description = "课程所属院系")
    @ExcelProperty(value = "课程所属院系")
    private String courseDept;
}