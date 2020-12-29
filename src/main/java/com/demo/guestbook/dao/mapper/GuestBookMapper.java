package com.demo.guestbook.dao.mapper;

import com.demo.guestbook.entity.GuestBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:07
 */
@Mapper
public interface GuestBookMapper {
    /**
     * 查询留言列表
     * @param guestBook
     * @return
     */
    List<GuestBook> list(GuestBook guestBook);

    /**
     * 查询一条留言
     * @param id
     * @return
     */
    GuestBook get(int id);

    /**
     * 修改一条留言
     * @param guestBook
     * @return
     */
    int update(GuestBook guestBook);

    /**
     * 删除一条留言
     * @param guestBook
     * @return
     */
    int remove(GuestBook guestBook);

    /**
     * 新增一条留言
     * @param guestBook
     * @return
     */
    int save(GuestBook guestBook);
}
