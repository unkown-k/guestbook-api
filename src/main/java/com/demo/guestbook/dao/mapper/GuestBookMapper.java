package com.demo.guestbook.dao.mapper;

import com.demo.guestbook.model.GuestBookDo;
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
     List<GuestBookDo> list(GuestBookDo guestBookDo);
     int update(GuestBookDo guestBookDo);
     int remove(GuestBookDo guestBookDo);
     int save(GuestBookDo guestBookDo);
}
