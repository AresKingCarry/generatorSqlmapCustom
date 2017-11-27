package com.dmsd.pojo;

public class TGroup {
    private Long id;

    private String name;

    private String address;

    private Long teamid;

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

    public Long getTeamid() {
        return teamid;
    }

    public void setTeamid(Long teamid) {
        this.teamid = teamid;
    }
}