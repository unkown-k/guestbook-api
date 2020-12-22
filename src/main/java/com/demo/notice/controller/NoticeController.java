package com.demo.notice.controller;

import com.alibaba.fastjson.JSON;
import com.demo.common.model.Result;
import com.demo.notice.model.NoticeDo;
import com.demo.notice.service.inter.NoticeServiceInter;
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
@RequestMapping("/notice")
public class NoticeController {
    @Resource
    NoticeServiceInter noticeServiceInter;

    @GetMapping
    public Result<NoticeDo> list(NoticeDo noticeDo) {
        System.out.println("list " + JSON.toJSONString(noticeDo));
        return noticeServiceInter.list(noticeDo);
    }
    @GetMapping("/{id}")
    public Result<NoticeDo> get(@PathVariable Integer id,NoticeDo noticeDo) {
        System.out.println("getid " + JSON.toJSONString(noticeDo)+"id"+id);
        return noticeServiceInter.get(noticeDo);
    }

    @PostMapping
    public Result<NoticeDo> save(@RequestBody NoticeDo noticeDo) {
        System.out.println("save " + JSON.toJSONString(noticeDo));
        return noticeServiceInter.save(noticeDo);
    }


    @PatchMapping("/{id}")
    public Result<NoticeDo> update(@PathVariable Integer id, @RequestBody NoticeDo noticeDo) {
        System.out.println("update " + JSON.toJSONString(noticeDo));
        return noticeServiceInter.update(noticeDo);
    }


    @DeleteMapping("/{id}")
    public Result<NoticeDo> remove(@PathVariable Integer id, @RequestBody NoticeDo noticeDo) {
        System.out.println("remove " + JSON.toJSONString(noticeDo));
        return noticeServiceInter.remove(noticeDo);
    }
}
