package org.java.entity;

import javax.persistence.*;

public class Userstate {
    @Id
    @Column(name = "UserStateId")
    private Integer userstateid;

    /**
     * 1：正常状态；0：被屏蔽
     */
    @Column(name = "UserStateName")
    private String userstatename;

    /**
     * @return UserStateId
     */
    public Integer getUserstateid() {
        return userstateid;
    }

    /**
     * @param userstateid
     */
    public void setUserstateid(Integer userstateid) {
        this.userstateid = userstateid;
    }

    /**
     * 获取1：正常状态；0：被屏蔽
     *
     * @return UserStateName - 1：正常状态；0：被屏蔽
     */
    public String getUserstatename() {
        return userstatename;
    }

    /**
     * 设置1：正常状态；0：被屏蔽
     *
     * @param userstatename 1：正常状态；0：被屏蔽
     */
    public void setUserstatename(String userstatename) {
        this.userstatename = userstatename;
    }
}