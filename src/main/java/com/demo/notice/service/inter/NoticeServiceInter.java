package com.demo.notice.service.inter;


import com.demo.common.model.Result;
import com.demo.notice.model.NoticeDo;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:04
 */

public interface NoticeServiceInter {
    Result<NoticeDo> list(NoticeDo noticeDo);
    Result<NoticeDo> update(NoticeDo noticeDo);
    Result<NoticeDo> remove(NoticeDo noticeDo);
    Result<NoticeDo> save(NoticeDo noticeDo);
    Result<NoticeDo> get(NoticeDo noticeDo);
}
