package com.basoft.service.entity;

public class Girl {
    private Long id;

    private String name;

    private Integer age;

    private String cup;

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
        this.name = name == null ? null : name.trim();
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
}