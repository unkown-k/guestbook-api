package com.demo.guestbook.service.impl;

import com.demo.common.model.Result;
import com.demo.guestbook.dao.mapper.GuestBookMapper;
import com.demo.guestbook.entity.GuestBook;
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

    /**
     * 查询留言列表
     * @param guestBook
     * @return
     */
    @Override
    public Result<GuestBook> list(GuestBook guestBook) {
        Result<GuestBook> result = new Result<>();
        List<GuestBook> guestBookList = guestBookMapper.list(guestBook);
        result.setData(guestBookList);
        return result;
    }

    /**
     * 修改一条留言
     * @param guestBook
     * @return
     */
    @Override
    public Result update(GuestBook guestBook) {
        Result result = new Result<>();
        int i = guestBookMapper.update(guestBook);
        if (i > 0) {
            return new Result();
        } else {
            result.setCode(4444);
            result.setMsg("错误");
            return result;
        }
    }

    /**
     * 删除一条留言
     * @param id
     * @return
     */
    @Override
    public Result remove(int id) {
        Result result = new Result<>();
        int i = guestBookMapper.remove(id);
        if (i > 0) {
            return new Result();
        } else {
            result.setCode(4444);
            result.setMsg("错误");
            return result;
        }
    }

    /**
     * 新增一条留言
     * @param guestBook
     * @return
     */
    @Override
    public Result save(GuestBook guestBook) {
        Result result = new Result<>();
        int i = guestBookMapper.save(guestBook);
        if (i > 0) {
            return new Result();
        } else {
            result.setCode(4444);
            result.setMsg("错误");
            return result;
        }
    }
}
