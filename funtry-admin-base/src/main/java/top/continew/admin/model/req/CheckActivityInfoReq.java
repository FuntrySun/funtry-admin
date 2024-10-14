package top.continew.admin.model.req;

import java.io.Serial;
import java.time.*;

import jakarta.validation.constraints.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import org.hibernate.validator.constraints.Length;

import top.continew.starter.extension.crud.model.req.BaseReq;

/**
 * 创建或修改签到活动信息
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@Schema(description = "创建或修改签到活动信息")
public class CheckActivityInfoReq extends BaseReq {

    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 签到开始时间
     */
    @Schema(description = "签到开始时间")
    private LocalDateTime startTime;
    /**
     * 签到时长
     */
    @Schema(description = "签到时长")
    @NotNull(message = "签到时长不能为空")
    private Integer endTime;

    /**
     * 签到教师id
     */
    @Schema(description = "签到教师id")
    private String teacherId;

    /**
     * 签到课程id
     */
    @Schema(description = "签到课程id")
    private String courseId;
    /**
     * 签到发起状态
     */
    @Schema(description = "签到发起状态")
    private Integer checkStatus;
}