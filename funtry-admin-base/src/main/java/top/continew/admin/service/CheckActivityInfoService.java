package top.continew.admin.service;

import top.continew.starter.extension.crud.service.BaseService;
import top.continew.admin.model.query.CheckActivityInfoQuery;
import top.continew.admin.model.req.CheckActivityInfoReq;
import top.continew.admin.model.resp.CheckActivityInfoDetailResp;
import top.continew.admin.model.resp.CheckActivityInfoResp;

/**
 * 签到活动业务接口
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
public interface CheckActivityInfoService extends BaseService<CheckActivityInfoResp, CheckActivityInfoDetailResp, CheckActivityInfoQuery, CheckActivityInfoReq> {
    Long getCourseIdByTeacherId(String teacherId);

    String createCode(String activityId);
}