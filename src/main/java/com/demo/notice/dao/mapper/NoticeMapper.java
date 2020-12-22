package com.demo.notice.dao.mapper;


import com.demo.notice.model.NoticeDo;
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
public interface NoticeMapper {
     List<NoticeDo> list(NoticeDo noticeDo);
     NoticeDo get(NoticeDo noticeDo);
     int update(NoticeDo noticeDo);
     int remove(NoticeDo noticeDo);
     int save(NoticeDo noticeDo);
}
