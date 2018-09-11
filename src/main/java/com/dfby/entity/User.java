package com.dfby.entity;

/**
 * @program: SpringMVC
 * @Date: 2018/9/11 16:29
 * @Author: Mr.Zhang
 * @Description:
 */
public class User {
    private Integer uid;
    private String userid;
    private String password;

    public User() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer uid, String userid, String password) {
        this.uid = uid;
        this.userid = userid;
        this.password = password;
    }

    public User(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }
}
