package com.demo.testDemo.dao.mapper;

import com.demo.testDemo.model.TestModel;
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
public interface TestMapper {
     List<TestModel> testSelect(TestModel testModel);
     int testUpdate(TestModel testModel);
     int testDelete(TestModel testModel);
     int testInsert(TestModel testModel);
}
