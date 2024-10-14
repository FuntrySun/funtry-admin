package top.continew.admin.model.resp;

import java.io.Serial;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.continew.starter.extension.crud.model.resp.BaseResp;

/**
 * 课程信息
 *
 * @author funtry
 * @since 2024/10/13 13:18
 */
@Data
@Schema(description = "课程信息")
public class CoursesResp extends BaseResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 课程所属教师
     */
    @Schema(description = "课程所属教师")
    private Long userId;

    /**
     * 课程名称
     */
    @Schema(description = "课程名称")
    private String courseName;

    /**
     * 课程介绍
     */
    @Schema(description = "课程介绍")
    private String courseDesc;

    /**
     * 课程所属院系
     */
    @Schema(description = "课程所属院系")
    private String courseDept;

    /**
     * 更新者
     */
    @Schema(description = "更新者")
    private Long updateUser;

    /**
     * 更新时间
     */
    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}