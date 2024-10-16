package top.continew.admin.service;

import top.continew.starter.extension.crud.service.BaseService;
import top.continew.admin.model.query.StudentCheckInsQuery;
import top.continew.admin.model.req.StudentCheckInsReq;
import top.continew.admin.model.resp.StudentCheckInsDetailResp;
import top.continew.admin.model.resp.StudentCheckInsResp;

/**
 * 学生签到记录业务接口
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
public interface StudentCheckInsService extends BaseService<StudentCheckInsResp, StudentCheckInsDetailResp, StudentCheckInsQuery, StudentCheckInsReq> {
    boolean isSign(String id);
}