package com.basoft.service.entity;

import java.util.Date;

public class EorderCategory {
    private Long categoryid;

    private Long storeid;

    private String ctgname;

    private Byte isdelete;

    private Long createdid;

    private Date createddt;

    private Long modifiedid;

    private Date modifieddt;

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public Long getStoreid() {
        return storeid;
    }

    public void setStoreid(Long storeid) {
        this.storeid = storeid;
    }

    public String getCtgname() {
        return ctgname;
    }

    public void setCtgname(String ctgname) {
        this.ctgname = ctgname == null ? null : ctgname.trim();
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }

    public Long getCreatedid() {
        return createdid;
    }

    public void setCreatedid(Long createdid) {
        this.createdid = createdid;
    }

    public Date getCreateddt() {
        return createddt;
    }

    public void setCreateddt(Date createddt) {
        this.createddt = createddt;
    }

    public Long getModifiedid() {
        return modifiedid;
    }

    public void setModifiedid(Long modifiedid) {
        this.modifiedid = modifiedid;
    }

    public Date getModifieddt() {
        return modifieddt;
    }

    public void setModifieddt(Date modifieddt) {
        this.modifieddt = modifieddt;
    }
}