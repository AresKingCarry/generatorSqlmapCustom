package com.dmsd.pojo;

public class TStuff {
    private Long id;

    private String name;

    private String sex;

    private String address;

    private Long classid;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }
}