package com.demo.guestbook.service.impl;

import com.demo.common.model.Result;
import com.demo.guestbook.dao.mapper.GuestBookMapper;
import com.demo.guestbook.model.GuestBookDo;
import com.demo.guestbook.service.inter.GuestBookServiceInter;
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
public class GuestBookServiceImpl implements GuestBookServiceInter {
    @Resource
    GuestBookMapper guestBookMapper;

    @Override
    public Result<GuestBookDo> list(GuestBookDo guestBookDo) {
        Result<GuestBookDo> testModelResult = new Result<>();
        List<GuestBookDo> guestBookDos = guestBookMapper.list(guestBookDo);
        testModelResult.setData(guestBookDos);
        return testModelResult;
    }

    @Override
    public Result<GuestBookDo> update(GuestBookDo guestBookDo) {
        Result<GuestBookDo> testModelResult = new Result<>();
        int i = guestBookMapper.update(guestBookDo);
        if (i > 0) {
            return new Result();
        } else {
            testModelResult.setCode(4444);
            testModelResult.setMsg("错误");
            return testModelResult;
        }
    }

    @Override
    public Result<GuestBookDo> remove(GuestBookDo guestBookDo) {
        Result<GuestBookDo> testModelResult = new Result<>();
        int i = guestBookMapper.remove(guestBookDo);
        if (i > 0) {
            return new Result();
        } else {
            testModelResult.setCode(4444);
            testModelResult.setMsg("错误");
            return testModelResult;
        }
    }

    @Override
    public Result<GuestBookDo> save(GuestBookDo guestBookDo) {
        Result<GuestBookDo> testModelResult = new Result<>();
        int i = 0;
        i = guestBookMapper.save(guestBookDo);
        if (i > 0) {
            return new Result();
        } else {
            testModelResult.setCode(4444);
            testModelResult.setMsg("错误");
            return testModelResult;
        }
    }
}
