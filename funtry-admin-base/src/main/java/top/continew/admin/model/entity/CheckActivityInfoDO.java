package top.continew.admin.model.entity;

import java.io.Serial;
import java.time.*;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

import top.continew.starter.extension.crud.model.entity.BaseDO;

/**
 * 签到活动实体
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Data
@TableName("check_activity_info")
public class CheckActivityInfoDO extends BaseDO {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 教师ID
     */
    private Long teacherId;

    /**
     * 课程ID
     */
    private Long courseId;

    /**
     * 签到开始时间
     */
    private LocalDateTime startTime;

    /**
     * 签到时长
     */
    private Integer endTime;

    /**
     * 签到状态
     */
    private Integer checkStatus;
}