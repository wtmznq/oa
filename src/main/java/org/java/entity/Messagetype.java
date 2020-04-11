package org.java.entity;

import javax.persistence.*;

public class Messagetype {
    /**
     * 消息类型Id
     */
    @Id
    @Column(name = "MessageTypeId")
    private Integer messagetypeid;

    /**
     * 消息类型名称
     */
    @Column(name = "MessageTypeName")
    private String messagetypename;

    /**
     * 消息类型描述
     */
    @Column(name = "MessageDesc")
    private String messagedesc;

    /**
     * 获取消息类型Id
     *
     * @return MessageTypeId - 消息类型Id
     */
    public Integer getMessagetypeid() {
        return messagetypeid;
    }

    /**
     * 设置消息类型Id
     *
     * @param messagetypeid 消息类型Id
     */
    public void setMessagetypeid(Integer messagetypeid) {
        this.messagetypeid = messagetypeid;
    }

    /**
     * 获取消息类型名称
     *
     * @return MessageTypeName - 消息类型名称
     */
    public String getMessagetypename() {
        return messagetypename;
    }

    /**
     * 设置消息类型名称
     *
     * @param messagetypename 消息类型名称
     */
    public void setMessagetypename(String messagetypename) {
        this.messagetypename = messagetypename;
    }

    /**
     * 获取消息类型描述
     *
     * @return MessageDesc - 消息类型描述
     */
    public String getMessagedesc() {
        return messagedesc;
    }

    /**
     * 设置消息类型描述
     *
     * @param messagedesc 消息类型描述
     */
    public void setMessagedesc(String messagedesc) {
        this.messagedesc = messagedesc;
    }
}