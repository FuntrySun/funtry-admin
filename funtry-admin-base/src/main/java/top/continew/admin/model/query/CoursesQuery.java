package top.continew.admin.model.query;

import java.io.Serial;
import java.io.Serializable;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.continew.starter.data.core.annotation.Query;
import top.continew.starter.data.core.enums.QueryType;

/**
 * 课程查询条件
 *
 * @author funtry
 * @since 2024/10/13 13:18
 */
@Data
@Schema(description = "课程查询条件")
public class CoursesQuery implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 课程所属教师
     */
    @Schema(description = "课程所属教师")
    @Query(type = QueryType.EQ)
    private Long userId;

    /**
     * 课程名称
     */
    @Schema(description = "课程名称")
    @Query(type = QueryType.EQ)
    private String courseName;
}