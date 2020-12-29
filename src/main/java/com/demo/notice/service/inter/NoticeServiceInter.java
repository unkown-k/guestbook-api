package com.demo.notice.service.inter;


import com.demo.common.model.Result;
import com.demo.notice.entity.Notice;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:04
 */
public interface NoticeServiceInter {

    /**
     * 查询一条通知
     * @param id
     * @return
     */
    Result<Notice> get(int id);
}
