package top.continew.admin.controller;

import cn.dev33.satoken.stp.StpUtil;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import top.continew.admin.model.entity.StudentCheckInsDO;
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
import top.continew.starter.extension.crud.model.resp.BaseIdResp;
import top.continew.starter.web.model.R;

import java.time.LocalDateTime;

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
    @Autowired
    private StudentCheckInsService studentCheckInsService;

    /*先判断是否已经签到
     * 将拿到的签到活动的id与老师发布的签到活动的id进行比对
     * 如果相同，则进行签到
     * 如果不同，则提示错误
     * */
    @Operation(summary = "学生扫码签到")
    @PostMapping("/addRecord/{id}")
    public R addRecord(@PathVariable("id") String id) {
        boolean isSign = studentCheckInsService.isSign(id);
        if (!isSign) {
            return R.ok("401", "签到码信息错误，签到失败！");
        }
        StudentCheckInsDO record = new StudentCheckInsDO();
        record.setCheckInId(Long.valueOf(id));
        record.setStudentId(StpUtil.getLoginIdAsLong());
        record.setCheckInTime(LocalDateTime.now());
        return R.ok("签到成功！","");
    }
}