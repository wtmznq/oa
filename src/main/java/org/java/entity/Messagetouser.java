package org.java.entity;

import javax.persistence.*;

public class Messagetouser {
    /**
     * 序号Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 消息Id,Message表外键，对应MessageId字段
     */
    @Column(name = "MessageId")
    private Integer messageid;

    /**
     * 发送对象Id,UserInfo表外键，对应UserId字段
     */
    @Column(name = "ToUserId")
    private String touserid;

    /**
     * 是否已读。1：已读、0：未读
     */
    @Column(name = "IfRead")
    private Integer ifread;

    /**
     * 获取序号Id
     *
     * @return Id - 序号Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序号Id
     *
     * @param id 序号Id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取发送对象Id,UserInfo表外键，对应UserId字段
     *
     * @return ToUserId - 发送对象Id,UserInfo表外键，对应UserId字段
     */
    public String getTouserid() {
        return touserid;
    }

    /**
     * 设置发送对象Id,UserInfo表外键，对应UserId字段
     *
     * @param touserid 发送对象Id,UserInfo表外键，对应UserId字段
     */
    public void setTouserid(String touserid) {
        this.touserid = touserid;
    }

    /**
     * 获取是否已读。1：已读、0：未读
     *
     * @return IfRead - 是否已读。1：已读、0：未读
     */
    public Integer getIfread() {
        return ifread;
    }

    /**
     * 设置是否已读。1：已读、0：未读
     *
     * @param ifread 是否已读。1：已读、0：未读
     */
    public void setIfread(Integer ifread) {
        this.ifread = ifread;
    }
}