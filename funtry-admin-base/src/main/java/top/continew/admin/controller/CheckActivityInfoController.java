package top.continew.admin.controller;

import cn.dev33.satoken.stp.StpUtil;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import top.continew.admin.model.entity.CheckActivityInfoDO;
import top.continew.starter.extension.crud.enums.Api;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import top.continew.starter.extension.crud.annotation.CrudRequestMapping;
import top.continew.starter.extension.crud.controller.BaseController;
import top.continew.admin.model.query.CheckActivityInfoQuery;
import top.continew.admin.model.req.CheckActivityInfoReq;
import top.continew.admin.model.resp.CheckActivityInfoDetailResp;
import top.continew.admin.model.resp.CheckActivityInfoResp;
import top.continew.admin.service.CheckActivityInfoService;
import top.continew.starter.extension.crud.model.resp.BaseIdResp;

import java.time.LocalDateTime;

/**
 * 签到活动管理 API
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Tag(name = "签到活动管理 API")
@RestController
@CrudRequestMapping(value = "/admin/checkActivityInfo", api = {Api.PAGE, Api.GET, Api.ADD, Api.UPDATE, Api.DELETE, Api.EXPORT})
public class CheckActivityInfoController extends BaseController<CheckActivityInfoService, CheckActivityInfoResp, CheckActivityInfoDetailResp, CheckActivityInfoQuery, CheckActivityInfoReq> {

    @Autowired
    private CheckActivityInfoService checkActivityInfoService;


    /**
     * 发布签到活动
     * @param req 发布签到活动请求参数
     * @return 发布签到活动响应参数 调用父类的add方法，保留原有的逻辑
     */
    @Override
    @PostMapping
    public BaseIdResp<Long> add(@RequestBody CheckActivityInfoReq req) {
        req.setStartTime(LocalDateTime.now());
        String teacherId = (String) StpUtil.getLoginId();
        req.setTeacherId(teacherId);
        // 根据教师ID设置课程ID
        String courseId = String.valueOf(checkActivityInfoService.getCourseIdByTeacherId(teacherId));
        if (courseId == null)
            throw new IllegalArgumentException("该教师未关联课程");
        req.setCourseId(courseId);
        req.setCheckStatus(1);   // 默认设置为已发布
        return super.add(req);
    }
    @Operation(summary = "创建签到码")
    @GetMapping("/qrcode/{activityId}")
    public String createCode(@PathVariable String activityId) {
        System.out.println("activityId: " + activityId);
        return checkActivityInfoService.createCode(activityId);
    }

}