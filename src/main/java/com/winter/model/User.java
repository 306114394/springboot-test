package com.winter.model;

import java.util.Date;

public class User {
    private Integer id;

    private Integer age;

    private String cupSize;

    private Date createtime;

    private Long currenttimemillis;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize == null ? null : cupSize.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getCurrenttimemillis() {
        return currenttimemillis;
    }

    public void setCurrenttimemillis(Long currenttimemillis) {
        this.currenttimemillis = currenttimemillis;
    }
}