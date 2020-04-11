package org.java.entity;

import java.util.Date;
import javax.persistence.*;

public class Schedule {
    /**
     * 日程Id
     */
    @Id
    @Column(name = "ScheduleId")
    private Integer scheduleid;

    /**
     * 日程标题
     */
    @Column(name = "Title")
    private String title;

    /**
     * 会议地址
     */
    @Column(name = "Address")
    private String address;

    /**
     * 会议类型,MeetingInfo表外键，对应MeetingId字段
     */
    @Column(name = "MeetingId")
    private Integer meetingid;

    /**
     * 日程开始时间
     */
    @Column(name = "BeginTime")
    private Date begintime;

    /**
     * 日程结束时间
     */
    @Column(name = "EndTime")
    private Date endtime;

    /**
     * 日程内容
     */
    @Column(name = "SchContent")
    private String schcontent;

    /**
     * 创建者
     */
    @Column(name = "CreateUser")
    private String createuser;

    /**
     * 创建时间
     */
    @Column(name = "CreateTime")
    private Date createtime;

    /**
     * 是否私有
     */
    @Column(name = "IfPrivate")
    private Integer ifprivate;

    /**
     * 获取日程Id
     *
     * @return ScheduleId - 日程Id
     */
    public Integer getScheduleid() {
        return scheduleid;
    }

    /**
     * 设置日程Id
     *
     * @param scheduleid 日程Id
     */
    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    /**
     * 获取日程标题
     *
     * @return Title - 日程标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置日程标题
     *
     * @param title 日程标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取会议地址
     *
     * @return Address - 会议地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置会议地址
     *
     * @param address 会议地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取会议类型,MeetingInfo表外键，对应MeetingId字段
     *
     * @return MeetingId - 会议类型,MeetingInfo表外键，对应MeetingId字段
     */
    public Integer getMeetingid() {
        return meetingid;
    }

    /**
     * 设置会议类型,MeetingInfo表外键，对应MeetingId字段
     *
     * @param meetingid 会议类型,MeetingInfo表外键，对应MeetingId字段
     */
    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    /**
     * 获取日程开始时间
     *
     * @return BeginTime - 日程开始时间
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * 设置日程开始时间
     *
     * @param begintime 日程开始时间
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * 获取日程结束时间
     *
     * @return EndTime - 日程结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置日程结束时间
     *
     * @param endtime 日程结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取日程内容
     *
     * @return SchContent - 日程内容
     */
    public String getSchcontent() {
        return schcontent;
    }

    /**
     * 设置日程内容
     *
     * @param schcontent 日程内容
     */
    public void setSchcontent(String schcontent) {
        this.schcontent = schcontent;
    }

    /**
     * 获取创建者
     *
     * @return CreateUser - 创建者
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建者
     *
     * @param createuser 创建者
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取创建时间
     *
     * @return CreateTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取是否私有
     *
     * @return IfPrivate - 是否私有
     */
    public Integer getIfprivate() {
        return ifprivate;
    }

    /**
     * 设置是否私有
     *
     * @param ifprivate 是否私有
     */
    public void setIfprivate(Integer ifprivate) {
        this.ifprivate = ifprivate;
    }
}