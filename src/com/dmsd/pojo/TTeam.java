package com.dmsd.pojo;

public class TTeam {
    private Long id;

    private String name;

    private String address;

    private Long schoolid;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Long schoolid) {
        this.schoolid = schoolid;
    }
}