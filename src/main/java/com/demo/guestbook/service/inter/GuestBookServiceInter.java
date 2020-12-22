package com.demo.guestbook.service.inter;

import com.demo.guestbook.model.GuestBookDo;
import com.demo.common.model.Result;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:04
 */

public interface GuestBookServiceInter {
    Result<GuestBookDo> list(GuestBookDo guestBookDo);
    Result<GuestBookDo> update(GuestBookDo guestBookDo);
    Result<GuestBookDo> remove(GuestBookDo guestBookDo);
    Result<GuestBookDo> save(GuestBookDo guestBookDo);
}
