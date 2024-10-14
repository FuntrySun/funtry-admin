package top.continew.admin.service.impl;

import cn.hutool.extra.qrcode.QrCodeUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.continew.admin.mapper.CoursesMapper;
import top.continew.admin.model.entity.CoursesDO;
import top.continew.starter.extension.crud.service.impl.BaseServiceImpl;
import top.continew.admin.mapper.CheckActivityInfoMapper;
import top.continew.admin.model.entity.CheckActivityInfoDO;
import top.continew.admin.model.query.CheckActivityInfoQuery;
import top.continew.admin.model.req.CheckActivityInfoReq;
import top.continew.admin.model.resp.CheckActivityInfoDetailResp;
import top.continew.admin.model.resp.CheckActivityInfoResp;
import top.continew.admin.service.CheckActivityInfoService;

import java.util.Base64;

/**
 * 签到活动业务实现
 *
 * @author funtry
 * @since 2024/10/13 13:10
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CheckActivityInfoServiceImpl extends BaseServiceImpl<CheckActivityInfoMapper, CheckActivityInfoDO, CheckActivityInfoResp, CheckActivityInfoDetailResp, CheckActivityInfoQuery, CheckActivityInfoReq> implements CheckActivityInfoService {

    @Autowired
    private CoursesMapper coursesMapper;
    @Override
    public Long getCourseIdByTeacherId(String teacherId) {
        QueryWrapper<CoursesDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", teacherId);
        CoursesDO coursesDO = coursesMapper.selectOne(queryWrapper);
        try{
            if(coursesDO == null){
                log.error("getCourseIdByTeacherId 查询课程id失败，原因：没有查询到相应的课程信息");
                return null;
            }
        }catch (Exception e){
            log.error("getCourseIdByTeacherId 查询课程id失败", e);
            return null;
        }
        return coursesDO.getUserId();
    }
    // 生成签到的二维码
    @Override
    public String createCode(String activityId) {
        // TODO 实现生成签到的二维码
        byte[] bytes = QrCodeUtil.generatePng(activityId,300,300);
        String base64 = Base64.getEncoder().encodeToString(bytes);
        log.info(base64);
        return base64;
    }
}