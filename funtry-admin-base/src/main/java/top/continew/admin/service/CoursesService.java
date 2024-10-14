package top.continew.admin.service;

import top.continew.starter.extension.crud.service.BaseService;
import top.continew.admin.model.query.CoursesQuery;
import top.continew.admin.model.req.CoursesReq;
import top.continew.admin.model.resp.CoursesDetailResp;
import top.continew.admin.model.resp.CoursesResp;

/**
 * 课程业务接口
 *
 * @author funtry
 * @since 2024/10/13 13:18
 */
public interface CoursesService extends BaseService<CoursesResp, CoursesDetailResp, CoursesQuery, CoursesReq> {}