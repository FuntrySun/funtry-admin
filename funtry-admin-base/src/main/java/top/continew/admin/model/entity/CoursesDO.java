package top.continew.admin.model.entity;

import java.io.Serial;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

import top.continew.starter.extension.crud.model.entity.BaseDO;

/**
 * 课程实体
 *
 * @author funtry
 * @since 2024/10/13 13:18
 */
@Data
@TableName("sys_courses")
public class CoursesDO extends BaseDO {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 课程所属教师
     */
    private Long userId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程介绍
     */
    private String courseDesc;

    /**
     * 课程所属院系
     */
    private String courseDept;
}