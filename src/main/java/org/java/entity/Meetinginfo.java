package org.java.entity;

import javax.persistence.*;

public class Meetinginfo {
    /**
     * 会议类型Id
     */
    @Id
    @Column(name = "MeetingId")
    private Integer meetingid;

    /**
     * 会议类型名称
     */
    @Column(name = "MeetingName")
    private String meetingname;

    /**
     * 获取会议类型Id
     *
     * @return MeetingId - 会议类型Id
     */
    public Integer getMeetingid() {
        return meetingid;
    }

    /**
     * 设置会议类型Id
     *
     * @param meetingid 会议类型Id
     */
    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    /**
     * 获取会议类型名称
     *
     * @return MeetingName - 会议类型名称
     */
    public String getMeetingname() {
        return meetingname;
    }

    /**
     * 设置会议类型名称
     *
     * @param meetingname 会议类型名称
     */
    public void setMeetingname(String meetingname) {
        this.meetingname = meetingname;
    }
}