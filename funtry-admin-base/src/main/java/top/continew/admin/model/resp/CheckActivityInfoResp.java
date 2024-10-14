package top.continew.admin.model.resp;

import java.io.Serial;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.continew.starter.extension.crud.model.resp.BaseResp;

/**
 * 签到活动信息
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@Schema(description = "签到活动信息")
public class CheckActivityInfoResp extends BaseResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 教师ID
     */
    @Schema(description = "教师ID")
    private Long teacherId;

    /**
     * 课程ID
     */
    @Schema(description = "课程ID")
    private Long courseId;

    /**
     * 签到开始时间
     */
    @Schema(description = "签到开始时间")
    private LocalDateTime startTime;

    /**
     * 签到时长
     */
    @Schema(description = "签到时长")
    private Integer endTime;

    /**
     * 签到状态
     */
    @Schema(description = "签到状态")
    private Integer checkStatus;

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