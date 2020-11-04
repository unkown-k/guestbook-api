package com.demo.testDemo.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:19
 */

public class TResult<T> {
    int errCode = 0;
    String errMsg = "ok";
    List<T> data = null;
    String stringData;
    Integer intData;
    T model;
    String url;
    Integer total;
    BigDecimal decimalData;

    /**
     * @return errCode
     */
    public int getErrCode() {
        return errCode;
    }

    /**
     * @param errCode
     */
    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * @param errMsg
     */
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
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
     * @return stringData
     */
    public String getStringData() {
        return stringData;
    }

    /**
     * @param stringData
     */
    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    /**
     * @return intData
     */
    public Integer getIntData() {
        return intData;
    }

    /**
     * @param intData
     */
    public void setIntData(Integer intData) {
        this.intData = intData;
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

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return decimalData
     */
    public BigDecimal getDecimalData() {
        return decimalData;
    }

    /**
     * @param decimalData
     */
    public void setDecimalData(BigDecimal decimalData) {
        this.decimalData = decimalData;
    }
}
