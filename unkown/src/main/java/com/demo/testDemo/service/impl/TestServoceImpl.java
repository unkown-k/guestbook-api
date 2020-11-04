package com.demo.testDemo.service.impl;

import com.demo.testDemo.dao.mapper.TestMapper;
import com.demo.testDemo.model.TResult;
import com.demo.testDemo.model.TestModel;
import com.demo.testDemo.service.inter.TestServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:06
 */
@Service
public class TestServoceImpl implements TestServiceInter {
    @Resource
    TestMapper testMapper;
    @Override
    public TResult<TestModel>  testSelect(TestModel testModel){
        TResult<TestModel> testModelTResult=new TResult<>();
        List<TestModel>testModels=new ArrayList<>();
        testModels=testMapper.testSelect(testModel);
        testModelTResult.setData(testModels);
        return testModelTResult;
    }

    @Override
    public TResult<TestModel> testUpdate(TestModel testModel) {
        TResult<TestModel> testModelTResult=new TResult<>();
        int i=0;
        i=testMapper.testUpdate(testModel);
        if(i>0){
            return new TResult();
        }else {
            testModelTResult.setErrCode(4444);
            testModelTResult.setErrMsg("错误");
            return testModelTResult;
        }
    }

    @Override
    public TResult<TestModel> testDelete(TestModel testModel) {
        TResult<TestModel> testModelTResult=new TResult<>();
        int i=0;
        i=testMapper.testDelete(testModel);
        if(i>0){
            return new TResult();
        }else {
            testModelTResult.setErrCode(4444);
            testModelTResult.setErrMsg("错误");
            return testModelTResult;
        }
    }

    @Override
    public TResult<TestModel> testInsert(TestModel testModel) {
        TResult<TestModel> testModelTResult=new TResult<>();
        int i=0;
        i=testMapper.testInsert(testModel);
        if(i>0){
            return new TResult();
        }else {
            testModelTResult.setErrCode(4444);
            testModelTResult.setErrMsg("错误");
            return testModelTResult;
        }
    }
}
