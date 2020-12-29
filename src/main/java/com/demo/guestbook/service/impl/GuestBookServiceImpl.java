package com.demo.guestbook.service.impl;

import com.demo.common.model.Result;
import com.demo.guestbook.dao.mapper.GuestBookMapper;
import com.demo.guestbook.entity.GuestBook;
import com.demo.guestbook.service.inter.GuestBookServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
     * @param uid
     * @return
     */
    @Override
    public Result<GuestBook> list(String uid) {
        Result<GuestBook> result = new Result<>();
        List<GuestBook> list = guestBookMapper.list(new GuestBook());
        for (int i = 0; i < list.size(); i++) {
            if (uid.equals(list.get(i).getUid())){
                list.get(i).setEdit(1);
            }else{
                list.get(i).setEdit(0);
            }
            list.get(i).setUid(null);
        }
        result.setData(list);
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
        GuestBook gb = guestBookMapper.get(guestBook.getId());
        if (!gb.getUid().equals(guestBook.getUid())){
            result.setCode(4444);
            result.setMsg("无修改权限");
            return result;
        }
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
     * @param guestBook
     * @return
     */
    @Override
    public Result remove(GuestBook guestBook) {
        Result result = new Result<>();
        int i = guestBookMapper.remove(guestBook);
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
