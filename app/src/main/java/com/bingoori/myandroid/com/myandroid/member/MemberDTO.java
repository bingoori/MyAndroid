package com.bingoori.myandroid.com.myandroid.member;

/**
 * Created by USER on 2016-04-28.
 */
public class MemberDTO {
private String uid,password,name;

    public MemberDTO(){}
    public MemberDTO(String uid, String password, String name) {
        this.uid = uid;
        this.password = password;
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
