package com.demo.notice.controller;

import com.demo.common.model.Result;
import com.demo.notice.entity.Notice;
import com.demo.notice.service.inter.NoticeServiceInter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * 查询一条通知
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<Notice> get(@PathVariable Integer id) {
        return noticeServiceInter.get(id);
    }

}
