package com.demo.guestbook.controller;

import com.alibaba.fastjson.JSON;
import com.demo.common.model.Result;
import com.demo.guestbook.model.GuestBookDo;
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

    @GetMapping
    public Result<GuestBookDo> list(GuestBookDo guestBookDo) {
        System.out.println("list " + JSON.toJSONString(guestBookDo));
        return guestBookServiceInter.list(guestBookDo);
    }

    @PostMapping
    public Result<GuestBookDo> save(@RequestBody GuestBookDo guestBookDo) {
        System.out.println("save " + JSON.toJSONString(guestBookDo));
        return guestBookServiceInter.save(guestBookDo);
    }


    @PatchMapping("/{id}")
    public Result<GuestBookDo> update(@PathVariable Integer id, @RequestBody GuestBookDo guestBookDo) {
        System.out.println("update " + JSON.toJSONString(guestBookDo));
        return guestBookServiceInter.update(guestBookDo);
    }


    @DeleteMapping("/{id}")
    public Result<GuestBookDo> remove(@PathVariable Integer id, @RequestBody GuestBookDo guestBookDo) {
        System.out.println("remove " + JSON.toJSONString(guestBookDo));
        return guestBookServiceInter.remove(guestBookDo);
    }
}
