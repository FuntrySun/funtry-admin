package top.continew.admin.service.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import top.continew.starter.extension.crud.service.impl.BaseServiceImpl;
import top.continew.admin.mapper.StudentCheckInsMapper;
import top.continew.admin.model.entity.StudentCheckInsDO;
import top.continew.admin.model.query.StudentCheckInsQuery;
import top.continew.admin.model.req.StudentCheckInsReq;
import top.continew.admin.model.resp.StudentCheckInsDetailResp;
import top.continew.admin.model.resp.StudentCheckInsResp;
import top.continew.admin.service.StudentCheckInsService;

/**
 * 学生签到记录业务实现
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Service
@RequiredArgsConstructor
public class StudentCheckInsServiceImpl extends BaseServiceImpl<StudentCheckInsMapper, StudentCheckInsDO, StudentCheckInsResp, StudentCheckInsDetailResp, StudentCheckInsQuery, StudentCheckInsReq> implements StudentCheckInsService {}