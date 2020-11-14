package com.demo.testDemo.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zgx
 * @Date: 2020/11/2
 * @Time: 9:09
 */

public class TestModel {
    private String title;
    private String content;
    private Integer id;
    private Integer is_delete;

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return is_delete
     */
    public Integer getIs_delete() {
        return is_delete;
    }

    /**
     * @param is_delete
     */
    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
