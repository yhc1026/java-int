package com.spring.springboot_demo;

public class User {
    private String username;
    private Integer usernum;
    private String birthday;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUesename() {
        return username;
    }

    public Integer getUsernum() {
        return usernum;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "user{" +
                "uesename='" + username + '\'' +
                ", usernum=" + usernum +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
