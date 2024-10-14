package top.continew.admin.controller;

import top.continew.starter.extension.crud.enums.Api;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import top.continew.starter.extension.crud.annotation.CrudRequestMapping;
import top.continew.starter.extension.crud.controller.BaseController;
import top.continew.admin.model.query.CoursesQuery;
import top.continew.admin.model.req.CoursesReq;
import top.continew.admin.model.resp.CoursesDetailResp;
import top.continew.admin.model.resp.CoursesResp;
import top.continew.admin.service.CoursesService;

/**
 * 课程管理 API
 *
 * @author funtry
 * @since 2024/10/13 13:18
 */
@Tag(name = "课程管理 API")
@RestController
@CrudRequestMapping(value = "/admin/courses", api = {Api.PAGE, Api.GET, Api.ADD, Api.UPDATE, Api.DELETE, Api.EXPORT})
public class CoursesController extends BaseController<CoursesService, CoursesResp, CoursesDetailResp, CoursesQuery, CoursesReq> {}