package top.continew.admin.model.query;

import java.io.Serial;
import java.io.Serializable;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.continew.starter.data.core.annotation.Query;
import top.continew.starter.data.core.enums.QueryType;

/**
 * 签到活动查询条件
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@Schema(description = "签到活动查询条件")
public class CheckActivityInfoQuery implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 签到开始时间
     */
    @Schema(description = "签到开始时间")
    @Query(type = QueryType.EQ)
    private LocalDateTime startTime;

    /**
     * 签到时长
     */
    @Schema(description = "签到时长")
    @Query(type = QueryType.EQ)
    private Integer endTime;

    /**
     * 签到状态
     */
    @Schema(description = "签到状态")
    @Query(type = QueryType.EQ)
    private Integer checkStatus;
}