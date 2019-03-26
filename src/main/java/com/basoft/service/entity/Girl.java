package com.basoft.service.entity;

public class Girl implements java.io.Serializable{
    private Long id;

    private String name;

    private Integer age;

    private String cup;

    private Long timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup == null ? null : cup.trim();
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}