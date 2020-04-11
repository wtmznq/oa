package org.java.entity;

import java.util.Date;
import javax.persistence.*;

public class Loginlog {
    /**
     * 登录日志id
     */
    @Id
    @Column(name = "LoginId")
    private Integer loginid;

    /**
     * 登录者,UserInfo表外键，对应UserId字段
     */
    @Column(name = "UserId")
    private String userid;

    /**
     * 登录时间
     */
    @Column(name = "LoginTime")
    private Date logintime;

    /**
     * 登录是否成功。1：成功、0失败。
     */
    @Column(name = "IfSuccess")
    private Integer ifsuccess;

    /**
     * 登录用户IP
     */
    @Column(name = "LoginUserIp")
    private String loginuserip;

    /**
     * 登录备注
     */
    @Column(name = "LoginDesc")
    private String logindesc;

    /**
     * 获取登录日志id
     *
     * @return LoginId - 登录日志id
     */
    public Integer getLoginid() {
        return loginid;
    }

    /**
     * 设置登录日志id
     *
     * @param loginid 登录日志id
     */
    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    /**
     * 获取登录者,UserInfo表外键，对应UserId字段
     *
     * @return UserId - 登录者,UserInfo表外键，对应UserId字段
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置登录者,UserInfo表外键，对应UserId字段
     *
     * @param userid 登录者,UserInfo表外键，对应UserId字段
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取登录时间
     *
     * @return LoginTime - 登录时间
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * 设置登录时间
     *
     * @param logintime 登录时间
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * 获取登录是否成功。1：成功、0失败。
     *
     * @return IfSuccess - 登录是否成功。1：成功、0失败。
     */
    public Integer getIfsuccess() {
        return ifsuccess;
    }

    /**
     * 设置登录是否成功。1：成功、0失败。
     *
     * @param ifsuccess 登录是否成功。1：成功、0失败。
     */
    public void setIfsuccess(Integer ifsuccess) {
        this.ifsuccess = ifsuccess;
    }

    /**
     * 获取登录用户IP
     *
     * @return LoginUserIp - 登录用户IP
     */
    public String getLoginuserip() {
        return loginuserip;
    }

    /**
     * 设置登录用户IP
     *
     * @param loginuserip 登录用户IP
     */
    public void setLoginuserip(String loginuserip) {
        this.loginuserip = loginuserip;
    }

    /**
     * 获取登录备注
     *
     * @return LoginDesc - 登录备注
     */
    public String getLogindesc() {
        return logindesc;
    }

    /**
     * 设置登录备注
     *
     * @param logindesc 登录备注
     */
    public void setLogindesc(String logindesc) {
        this.logindesc = logindesc;
    }
}