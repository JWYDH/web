package com.jw.web.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String accountId;
    private String token;
    private Integer gmtCreat;
    private Integer gmtModified;

    protected User() {
    }

    public User(String accountId, String token, Integer gmtCreat, Integer gmtModified){
        this.accountId = accountId;
        this.token = token;
        this.gmtCreat = gmtCreat;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", accountId='" + accountId + '\'' +
                ", token='" + token + '\'' +
                ", gmtCreat=" + gmtCreat +
                ", gmtModified=" + gmtModified +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Integer gmtCreat) {
        this.gmtCreat = gmtCreat;
    }

    public Integer getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Integer gmtModified) {
        this.gmtModified = gmtModified;
    }
}