package com.demo.guestbook.controller;

import com.alibaba.fastjson.JSON;
import com.demo.common.model.Result;
import com.demo.guestbook.entity.GuestBook;
import com.demo.guestbook.service.inter.GuestBookServiceInter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:04
 */
@RestController
@RequestMapping("/guestbook")
public class GuestBookController {
    @Resource
    GuestBookServiceInter guestBookServiceInter;

    /**
     * UID长度
     */
    private static final int UID_LENGTH = 45;

    /**
     * 查询留言列表
     *
     * @return
     */
    @GetMapping
    public Result<GuestBook> list(@RequestHeader(name = "uid") String uid) {
        //参数判断
        Result result = new Result();
        if (uid == null || uid.length() != UID_LENGTH) {
            result.setCode(10000);
            result.setMsg("UID不合法");
            return result;
        }
        return guestBookServiceInter.list(uid);
    }

    /**
     * 新增一条留言
     *
     * @param guestBook
     * @return
     */
    @PostMapping
    public Result save(@RequestHeader(name = "uid") String uid, @RequestBody GuestBook guestBook) {
        System.out.println("save " + JSON.toJSONString(guestBook));
        guestBook.setUid(uid);
        //参数判断
        Result result = new Result();
        if (uid == null || uid.length() != UID_LENGTH) {
            result.setCode(10000);
            result.setMsg("UID不合法");
            return result;
        }
        if (guestBook.getNickName() == null || guestBook.getContent().trim().length() == 0) {
            result.setCode(10001);
            result.setMsg("昵称不能为空");
            return result;
        }
        if (guestBook.getNickName().trim().length() < 2 || guestBook.getNickName().trim().length() > 16) {
            result.setCode(10001);
            result.setMsg("昵称长度必须为2-16个字符");
            return result;
        }
        if (guestBook.getContent() == null || guestBook.getContent().trim().length() == 0) {
            result.setCode(10002);
            result.setMsg("留言内容不能为空");
            return result;
        }
        if (guestBook.getContent().trim().length() > 1000) {
            result.setCode(10002);
            result.setMsg("留言内容长度必须为2-1000个字符");
            return result;
        }
        return guestBookServiceInter.save(guestBook);
    }


    /**
     * 修改一条留言
     *
     * @param id
     * @param guestBook
     * @return
     */
    @PatchMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestHeader(name = "uid") String uid, @RequestBody GuestBook guestBook) {
        guestBook.setId(id);
        guestBook.setUid(uid);
        //参数判断
        Result result = new Result();
        if (uid == null || uid.length() != UID_LENGTH) {
            result.setCode(10000);
            result.setMsg("UID不合法");
            return result;
        }
        System.out.println("update " + JSON.toJSONString(guestBook));
        return guestBookServiceInter.update(guestBook);
    }


    /**
     * 删除一条留言
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result remove(@PathVariable Integer id, @RequestHeader(name = "uid") String uid) {
        System.out.println("remove " + id);
        GuestBook guestBook = new GuestBook();
        guestBook.setId(id);
        guestBook.setUid(uid);
        //参数判断
        Result result = new Result();
        if (uid == null || uid.length() != UID_LENGTH) {
            result.setCode(10000);
            result.setMsg("UID不合法");
            return result;
        }
        return guestBookServiceInter.remove(guestBook);
    }
}
