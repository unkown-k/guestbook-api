package com.demo.guestbook.service.inter;

import com.demo.guestbook.entity.GuestBook;
import com.demo.common.model.Result;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:04
 */
public interface GuestBookServiceInter {
    /**
     * 查询留言列表
     * @param uid
     * @return
     */
    Result<GuestBook> list(String uid);

    /**
     * 修改一条留言
     * @param guestBook
     * @return
     */
    Result update(GuestBook guestBook);

    /**
     * 删除一条留言
     * @param guestBook
     * @return
     */
    Result remove(GuestBook guestBook);

    /**
     * 新增一条留言
     * @param guestBook
     * @return
     */
    Result save(GuestBook guestBook);
}
