package org.java.entity;

import java.util.Date;
import javax.persistence.*;

public class Message {
    /**
     * 消息Id
     */
    @Id
    @Column(name = "MessageId")
    private Integer messageid;

    /**
     * 消息标题
     */
    @Column(name = "Title")
    private String title;

    /**
     * 消息内容
     */
    @Column(name = "Content")
    private String content;

    /**
     * 消息类型
     */
    @Column(name = "Type")
    private Integer type;

    /**
     * 开始有效时间
     */
    @Column(name = "BeginTime")
    private Date begintime;

    /**
     * 有效结束时间
     */
    @Column(name = "EndTime")
    private Date endtime;

    /**
     * 发送者
     */
    @Column(name = "FromUserId")
    private String fromuserid;

    /**
     * 是否已发布
     */
    @Column(name = "IfPublish")
    private Integer ifpublish;

    /**
     * 发送时间
     */
    @Column(name = "RecordTime")
    private Date recordtime;

    /**
     * 获取消息Id
     *
     * @return MessageId - 消息Id
     */
    public Integer getMessageid() {
        return messageid;
    }

    /**
     * 设置消息Id
     *
     * @param messageid 消息Id
     */
    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    /**
     * 获取消息标题
     *
     * @return Title - 消息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置消息标题
     *
     * @param title 消息标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取消息内容
     *
     * @return Content - 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置消息内容
     *
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取消息类型
     *
     * @return Type - 消息类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置消息类型
     *
     * @param type 消息类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取开始有效时间
     *
     * @return BeginTime - 开始有效时间
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * 设置开始有效时间
     *
     * @param begintime 开始有效时间
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * 获取有效结束时间
     *
     * @return EndTime - 有效结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置有效结束时间
     *
     * @param endtime 有效结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取发送者
     *
     * @return FromUserId - 发送者
     */
    public String getFromuserid() {
        return fromuserid;
    }

    /**
     * 设置发送者
     *
     * @param fromuserid 发送者
     */
    public void setFromuserid(String fromuserid) {
        this.fromuserid = fromuserid;
    }

    /**
     * 获取是否已发布
     *
     * @return IfPublish - 是否已发布
     */
    public Integer getIfpublish() {
        return ifpublish;
    }

    /**
     * 设置是否已发布
     *
     * @param ifpublish 是否已发布
     */
    public void setIfpublish(Integer ifpublish) {
        this.ifpublish = ifpublish;
    }

    /**
     * 获取发送时间
     *
     * @return RecordTime - 发送时间
     */
    public Date getRecordtime() {
        return recordtime;
    }

    /**
     * 设置发送时间
     *
     * @param recordtime 发送时间
     */
    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }
}