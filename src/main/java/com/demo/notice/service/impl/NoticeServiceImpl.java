package com.demo.notice.service.impl;

import com.demo.common.model.Result;
import com.demo.notice.dao.mapper.NoticeMapper;
import com.demo.notice.entity.Notice;
import com.demo.notice.service.inter.NoticeServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:06
 */
@Service
public class NoticeServiceImpl implements NoticeServiceInter {
    @Resource
    NoticeMapper noticeMapper;

    /**
     * 查询一条通知
     * @param id
     * @return
     */
    @Override
    public Result<Notice> get(int id) {
        Result<Notice> testModelResult = new Result<>();
        Notice notice1 = noticeMapper.get(id);
        testModelResult.setModel(notice1);
        return testModelResult;
    }
}
