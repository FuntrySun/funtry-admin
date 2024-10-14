package top.continew.admin.model.resp;

import java.io.Serial;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;

import top.continew.starter.extension.crud.model.resp.BaseDetailResp;

/**
 * 学生签到记录详情信息
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@ExcelIgnoreUnannotated
@Schema(description = "学生签到记录详情信息")
public class StudentCheckInsDetailResp extends BaseDetailResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 学生ID
     */
    @Schema(description = "学生ID")
    @ExcelProperty(value = "学生ID")
    private Long studentId;

    /**
     * 签到活动ID
     */
    @Schema(description = "签到活动ID")
    @ExcelProperty(value = "签到活动ID")
    private Long checkInId;

    /**
     * 学生签到时间
     */
    @Schema(description = "学生签到时间")
    @ExcelProperty(value = "学生签到时间")
    private LocalDateTime checkInTime;
}