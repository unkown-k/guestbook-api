package com.demo.notice.service.impl;

import com.demo.common.model.Result;
import com.demo.notice.dao.mapper.NoticeMapper;
import com.demo.notice.model.NoticeDo;
import com.demo.notice.service.inter.NoticeServiceInter;
import com.demo.notice.model.NoticeDo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public Result<NoticeDo> list(NoticeDo noticeDo) {
        Result<NoticeDo> testModelResult = new Result<>();
        List<NoticeDo> NoticeDos = noticeMapper.list(noticeDo);
        testModelResult.setData(NoticeDos);
        return testModelResult;
    }
    @Override
    public Result<NoticeDo> get(NoticeDo noticeDo) {
        Result<NoticeDo> testModelResult = new Result<>();
        NoticeDo noticeDo1 = noticeMapper.get(noticeDo);
        testModelResult.setModel(noticeDo1);
        return testModelResult;
    }
    @Override
    public Result<NoticeDo> update(NoticeDo noticeDo) {
        Result<NoticeDo> testModelResult = new Result<>();
        int i = noticeMapper.update(noticeDo);
        if (i > 0) {
            return new Result();
        } else {
            testModelResult.setCode(4444);
            testModelResult.setMsg("错误");
            return testModelResult;
        }
    }

    @Override
    public Result<NoticeDo> remove(NoticeDo noticeDo) {
        Result<NoticeDo> testModelResult = new Result<>();
        int i = noticeMapper.remove(noticeDo);
        if (i > 0) {
            return new Result();
        } else {
            testModelResult.setCode(4444);
            testModelResult.setMsg("错误");
            return testModelResult;
        }
    }

    @Override
    public Result<NoticeDo> save(NoticeDo noticeDo) {
        Result<NoticeDo> testModelResult = new Result<>();
        int i = 0;
        i = noticeMapper.save(noticeDo);
        if (i > 0) {
            return new Result();
        } else {
            testModelResult.setCode(4444);
            testModelResult.setMsg("错误");
            return testModelResult;
        }
    }
}
