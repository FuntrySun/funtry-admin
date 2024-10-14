package top.continew.admin.model.query;

import java.io.Serial;
import java.io.Serializable;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.continew.starter.data.core.annotation.Query;
import top.continew.starter.data.core.enums.QueryType;

/**
 * 学生签到记录查询条件
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@Schema(description = "学生签到记录查询条件")
public class StudentCheckInsQuery implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 学生ID
     */
    @Schema(description = "学生ID")
    @Query(type = QueryType.EQ)
    private Long studentId;

    /**
     * 签到活动ID
     */
    @Schema(description = "签到活动ID")
    @Query(type = QueryType.EQ)
    private Long checkInId;

    /**
     * 学生签到时间
     */
    @Schema(description = "学生签到时间")
    @Query(type = QueryType.EQ)
    private LocalDateTime checkInTime;
}