package com.demo.testDemo.service.inter;

import com.demo.testDemo.model.TestModel;
import com.demo.testDemo.model.TResult;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:04
 */

public interface TestServiceInter {
    TResult<TestModel> testSelect(TestModel testModel);
    TResult<TestModel>  testUpdate(TestModel testModel);
    TResult<TestModel>  testDelete(TestModel testModel);
    TResult<TestModel>  testInsert(TestModel testModel);


}
