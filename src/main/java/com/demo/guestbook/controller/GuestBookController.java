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
     * 查询留言列表
     * @param guestBook
     * @return
     */
    @GetMapping
    public Result<GuestBook> list(GuestBook guestBook) {
        System.out.println("list " + JSON.toJSONString(guestBook));
        return guestBookServiceInter.list(guestBook);
    }

    /**
     * 新增一条留言
     * @param guestBook
     * @return
     */
    @PostMapping
    public Result save(@RequestBody GuestBook guestBook) {
        System.out.println("save " + JSON.toJSONString(guestBook));
        //参数判断
        return guestBookServiceInter.save(guestBook);
    }


    /**
     * 修改一条留言
     * @param id
     * @param guestBook
     * @return
     */
    @PatchMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody GuestBook guestBook) {
        guestBook.setId(id);
        System.out.println("update " + JSON.toJSONString(guestBook));
        return guestBookServiceInter.update(guestBook);
    }


    /**
     * 删除一条留言
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result remove(@PathVariable Integer id) {
        System.out.println("remove " + id);
        return guestBookServiceInter.remove(id);
    }
}
