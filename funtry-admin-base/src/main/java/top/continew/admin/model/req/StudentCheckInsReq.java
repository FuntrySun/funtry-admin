package top.continew.admin.model.req;

import java.io.Serial;
import java.time.*;


import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import org.hibernate.validator.constraints.Length;

import top.continew.starter.extension.crud.model.req.BaseReq;

/**
 * 创建或修改学生签到记录信息
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@Schema(description = "创建或修改学生签到记录信息")
public class StudentCheckInsReq extends BaseReq {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Schema(description = "id")
    private Long id;

    /**
     * 学生ID
     */
    @Schema(description = "学生ID")
    private Long studentId;

    /**
     * 签到时间
     */
    @Schema(description = "签到时间")
    private LocalDateTime checkInTime;

    /**
     * 签到记录id
     */
    @Schema(description = "签到记录id")
    private Long checkInId;


}