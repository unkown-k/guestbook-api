package com.demo.notice.dao.mapper;


import com.demo.notice.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:07
 */
@Mapper
public interface NoticeMapper {
    /**
     * 查询一条通知
     * @param id
     * @return
     */
    Notice get(int id);
}
