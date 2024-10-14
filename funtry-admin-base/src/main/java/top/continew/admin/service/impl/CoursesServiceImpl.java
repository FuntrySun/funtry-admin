package top.continew.admin.service.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import top.continew.starter.extension.crud.service.impl.BaseServiceImpl;
import top.continew.admin.mapper.CoursesMapper;
import top.continew.admin.model.entity.CoursesDO;
import top.continew.admin.model.query.CoursesQuery;
import top.continew.admin.model.req.CoursesReq;
import top.continew.admin.model.resp.CoursesDetailResp;
import top.continew.admin.model.resp.CoursesResp;
import top.continew.admin.service.CoursesService;

/**
 * 课程业务实现
 *
 * @author funtry
 * @since 2024/10/13 13:18
 */
@Service
@RequiredArgsConstructor
public class CoursesServiceImpl extends BaseServiceImpl<CoursesMapper, CoursesDO, CoursesResp, CoursesDetailResp, CoursesQuery, CoursesReq> implements CoursesService {}