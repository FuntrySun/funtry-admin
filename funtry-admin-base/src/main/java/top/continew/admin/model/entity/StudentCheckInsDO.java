package top.continew.admin.model.entity;

import java.io.Serial;
import java.time.*;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

import top.continew.starter.extension.crud.model.entity.BaseDO;

/**
 * 学生签到记录实体
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@TableName("student_check_ins")
public class StudentCheckInsDO extends BaseDO {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 学生ID
     */
    private Long studentId;

    /**
     * 签到活动ID
     */
    private Long checkInId;

    /**
     * 学生签到时间
     */
    private LocalDateTime checkInTime;
}