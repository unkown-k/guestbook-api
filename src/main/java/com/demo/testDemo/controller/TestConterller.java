package com.demo.testDemo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.testDemo.model.TestModel;
import com.demo.testDemo.model.TResult;
import com.demo.testDemo.service.inter.TestServiceInter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:04
 */
@RestController
public class TestConterller {
@Resource
    TestServiceInter testServiceInter;
    @GetMapping(value = "/testSelect")
    public TResult<TestModel> testSelect(TestModel testModel){
        System.out.println("进来testSelect"+ JSON.toJSONString(testModel));

        return testServiceInter.testSelect(testModel);
    }
    @PostMapping(value = "/testUpdate")
    public TResult<TestModel> testUpdate(@RequestBody TestModel testModel){
        System.out.println("进来testUpdate"+ JSON.toJSONString(testModel));
        return testServiceInter.testUpdate(testModel);
    }
    @PostMapping(value = "/testInsert")
    public TResult<TestModel> testInsert(@RequestBody TestModel testModel){
        System.out.println("进来testInsert"+ JSON.toJSONString(testModel));
        return testServiceInter.testInsert(testModel);
    }
    @PostMapping(value = "/testDelete")
    public TResult<TestModel> testDelete(@RequestBody TestModel testModel){
        System.out.println("进来testDelete"+ JSON.toJSONString(testModel));
        return testServiceInter.testDelete(testModel);
    }
}
