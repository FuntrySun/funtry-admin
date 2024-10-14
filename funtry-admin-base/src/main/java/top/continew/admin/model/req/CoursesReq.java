package top.continew.admin.model.req;

import java.io.Serial;
import java.time.*;

import jakarta.validation.constraints.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import org.hibernate.validator.constraints.Length;

import top.continew.starter.extension.crud.model.req.BaseReq;

/**
 * 创建或修改课程信息
 *
 * @author funtry
 * @since 2024/10/13 13:18
 */
@Data
@Schema(description = "创建或修改课程信息")
public class CoursesReq extends BaseReq {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 课程所属教师
     */
    @Schema(description = "课程所属教师")
    @NotNull(message = "课程所属教师不能为空")
    private Long userId;

    /**
     * 课程名称
     */
    @Schema(description = "课程名称")
    @NotBlank(message = "课程名称不能为空")
    @Length(max = 60, message = "课程名称长度不能超过 {max} 个字符")
    private String courseName;

    /**
     * 课程介绍
     */
    @Schema(description = "课程介绍")
    @Length(max = 100, message = "课程介绍长度不能超过 {max} 个字符")
    private String courseDesc;

    /**
     * 课程所属院系
     */
    @Schema(description = "课程所属院系")
    @Length(max = 30, message = "课程所属院系长度不能超过 {max} 个字符")
    private String courseDept;
}