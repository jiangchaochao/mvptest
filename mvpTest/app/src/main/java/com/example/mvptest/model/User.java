package com.example.mvptest.model;

/**
 * 用户信息类
 */
public class User {

    private String userName;
    private String passwd;

    public String getUserName() {
        return userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}