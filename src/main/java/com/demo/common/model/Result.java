package com.demo.common.model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:19
 */
public class Result<T> {
    int code = 0;
    String msg = "ok";
    List<T> data = null;
    T model;

    /**
     * @return errCode
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return errMsg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return data
     */
    public List<T> getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * @return model
     */
    public T getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(T model) {
        this.model = model;
    }

}
