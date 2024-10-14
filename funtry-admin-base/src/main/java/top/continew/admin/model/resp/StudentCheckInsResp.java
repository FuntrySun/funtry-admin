package top.continew.admin.model.resp;

import java.io.Serial;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.continew.starter.extension.crud.model.resp.BaseResp;

/**
 * 学生签到记录信息
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@Schema(description = "学生签到记录信息")
public class StudentCheckInsResp extends BaseResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 学生ID
     */
    @Schema(description = "学生ID")
    private Long studentId;

    /**
     * 签到活动ID
     */
    @Schema(description = "签到活动ID")
    private Long checkInId;

    /**
     * 学生签到时间
     */
    @Schema(description = "学生签到时间")
    private LocalDateTime checkInTime;
}