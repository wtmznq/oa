package org.java.entity;

import javax.persistence.*;

public class Precontract {
    /**
     * 预约序号Id
     */
    @Id
    @Column(name = "PreContractIdint")
    private Integer precontractidint;

    /**
     * 日程Id,表Schedule外键，对应ScheduleId字段
     */
    @Column(name = "ScheduleId")
    private Integer scheduleid;

    /**
     * 预约人,表UserInfo外键，对应UserId字段
     */
    @Column(name = "UserId")
    private String userid;

    /**
     * 获取预约序号Id
     *
     * @return PreContractIdint - 预约序号Id
     */
    public Integer getPrecontractidint() {
        return precontractidint;
    }

    /**
     * 设置预约序号Id
     *
     * @param precontractidint 预约序号Id
     */
    public void setPrecontractidint(Integer precontractidint) {
        this.precontractidint = precontractidint;
    }

    /**
     * 获取日程Id,表Schedule外键，对应ScheduleId字段
     *
     * @return ScheduleId - 日程Id,表Schedule外键，对应ScheduleId字段
     */
    public Integer getScheduleid() {
        return scheduleid;
    }

    /**
     * 设置日程Id,表Schedule外键，对应ScheduleId字段
     *
     * @param scheduleid 日程Id,表Schedule外键，对应ScheduleId字段
     */
    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    /**
     * 获取预约人,表UserInfo外键，对应UserId字段
     *
     * @return UserId - 预约人,表UserInfo外键，对应UserId字段
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置预约人,表UserInfo外键，对应UserId字段
     *
     * @param userid 预约人,表UserInfo外键，对应UserId字段
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
}