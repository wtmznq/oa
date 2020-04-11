package org.java.entity;

import javax.persistence.*;

public class Worktime {
    /**
     * 工作时间Id
     */
    @Id
    @Column(name = "WorkTimeId")
    private Integer worktimeid;

    /**
     * 上班时间
     */
    @Column(name = "OnDutyTime")
    private String ondutytime;

    /**
     * 下班时间
     */
    @Column(name = "OffDutyTime")
    private String offdutytime;

    /**
     * 获取工作时间Id
     *
     * @return WorkTimeId - 工作时间Id
     */
    public Integer getWorktimeid() {
        return worktimeid;
    }

    /**
     * 设置工作时间Id
     *
     * @param worktimeid 工作时间Id
     */
    public void setWorktimeid(Integer worktimeid) {
        this.worktimeid = worktimeid;
    }

    /**
     * 获取上班时间
     *
     * @return OnDutyTime - 上班时间
     */
    public String getOndutytime() {
        return ondutytime;
    }

    /**
     * 设置上班时间
     *
     * @param ondutytime 上班时间
     */
    public void setOndutytime(String ondutytime) {
        this.ondutytime = ondutytime;
    }

    /**
     * 获取下班时间
     *
     * @return OffDutyTime - 下班时间
     */
    public String getOffdutytime() {
        return offdutytime;
    }

    /**
     * 设置下班时间
     *
     * @param offdutytime 下班时间
     */
    public void setOffdutytime(String offdutytime) {
        this.offdutytime = offdutytime;
    }
}