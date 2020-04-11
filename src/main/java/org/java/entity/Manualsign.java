package org.java.entity;

import java.util.Date;
import javax.persistence.*;

public class Manualsign {
    /**
     * 签卡Id
     */
    @Id
    @Column(name = "SignId")
    private Integer signid;

    /**
     * 用户id,表UserInfo中userid的外键
     */
    @Column(name = "UserId")
    private String userid;

    /**
     * 签卡时间
     */
    @Column(name = "SignTime")
    private Date signtime;

    /**
     * 签卡备注
     */
    @Column(name = "SignDesc")
    private String signdesc;

    /**
     * 签卡标记
     */
    @Column(name = "SignTag")
    private Integer signtag;

    /**
     * 获取签卡Id
     *
     * @return SignId - 签卡Id
     */
    public Integer getSignid() {
        return signid;
    }

    /**
     * 设置签卡Id
     *
     * @param signid 签卡Id
     */
    public void setSignid(Integer signid) {
        this.signid = signid;
    }

    /**
     * 获取用户id,表UserInfo中userid的外键
     *
     * @return UserId - 用户id,表UserInfo中userid的外键
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户id,表UserInfo中userid的外键
     *
     * @param userid 用户id,表UserInfo中userid的外键
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取签卡时间
     *
     * @return SignTime - 签卡时间
     */
    public Date getSigntime() {
        return signtime;
    }

    /**
     * 设置签卡时间
     *
     * @param signtime 签卡时间
     */
    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    /**
     * 获取签卡备注
     *
     * @return SignDesc - 签卡备注
     */
    public String getSigndesc() {
        return signdesc;
    }

    /**
     * 设置签卡备注
     *
     * @param signdesc 签卡备注
     */
    public void setSigndesc(String signdesc) {
        this.signdesc = signdesc;
    }

    /**
     * 获取签卡标记
     *
     * @return SignTag - 签卡标记
     */
    public Integer getSigntag() {
        return signtag;
    }

    /**
     * 设置签卡标记
     *
     * @param signtag 签卡标记
     */
    public void setSigntag(Integer signtag) {
        this.signtag = signtag;
    }
}