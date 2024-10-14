package top.continew.admin.controller;

import top.continew.starter.extension.crud.enums.Api;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import top.continew.starter.extension.crud.annotation.CrudRequestMapping;
import top.continew.starter.extension.crud.controller.BaseController;
import top.continew.admin.model.query.StudentCheckInsQuery;
import top.continew.admin.model.req.StudentCheckInsReq;
import top.continew.admin.model.resp.StudentCheckInsDetailResp;
import top.continew.admin.model.resp.StudentCheckInsResp;
import top.continew.admin.service.StudentCheckInsService;

/**
 * 学生签到记录管理 API
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Tag(name = "学生签到记录管理 API")
@RestController
@CrudRequestMapping(value = "/admin/studentCheckIns", api = {Api.PAGE, Api.GET, Api.ADD, Api.UPDATE, Api.DELETE, Api.EXPORT})
public class StudentCheckInsController extends BaseController<StudentCheckInsService, StudentCheckInsResp, StudentCheckInsDetailResp, StudentCheckInsQuery, StudentCheckInsReq> {
}