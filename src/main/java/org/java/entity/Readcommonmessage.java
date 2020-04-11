package org.java.entity;

import javax.persistence.*;

public class Readcommonmessage {
    /**
     * 序号Id
     */
    @Id
    @Column(name = "ReadId")
    private Integer readid;

    /**
     * 消息Id,Message表外键，对应MessageId字段
     */
    @Column(name = "MessageId")
    private Integer messageid;

    /**
     * 消息读取者,UserInfo表外键，对应UserId字段
     */
    @Column(name = "UserId")
    private String userid;

    /**
     * 获取序号Id
     *
     * @return ReadId - 序号Id
     */
    public Integer getReadid() {
        return readid;
    }

    /**
     * 设置序号Id
     *
     * @param readid 序号Id
     */
    public void setReadid(Integer readid) {
        this.readid = readid;
    }

    /**
     * 获取消息Id,Message表外键，对应MessageId字段
     *
     * @return MessageId - 消息Id,Message表外键，对应MessageId字段
     */
    public Integer getMessageid() {
        return messageid;
    }

    /**
     * 设置消息Id,Message表外键，对应MessageId字段
     *
     * @param messageid 消息Id,Message表外键，对应MessageId字段
     */
    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    /**
     * 获取消息读取者,UserInfo表外键，对应UserId字段
     *
     * @return UserId - 消息读取者,UserInfo表外键，对应UserId字段
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置消息读取者,UserInfo表外键，对应UserId字段
     *
     * @param userid 消息读取者,UserInfo表外键，对应UserId字段
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
}