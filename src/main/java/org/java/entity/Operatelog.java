package org.java.entity;

import java.util.Date;
import javax.persistence.*;

public class Operatelog {
    /**
     * 操作日志Id
     */
    @Id
    @Column(name = "OperateId")
    private Integer operateid;

    /**
     * 操作者
     */
    @Column(name = "UserId")
    private String userid;

    /**
     * 操作名称
     */
    @Column(name = "OperateName")
    private String operatename;

    /**
     * 操作对象Id
     */
    @Column(name = "ObjectId")
    private String objectid;

    /**
     * 操作描述
     */
    @Column(name = "OperateDesc")
    private String operatedesc;

    /**
     * 操作时间
     */
    @Column(name = "OperateTime")
    private Date operatetime;

    /**
     * 获取操作日志Id
     *
     * @return OperateId - 操作日志Id
     */
    public Integer getOperateid() {
        return operateid;
    }

    /**
     * 设置操作日志Id
     *
     * @param operateid 操作日志Id
     */
    public void setOperateid(Integer operateid) {
        this.operateid = operateid;
    }

    /**
     * 获取操作者
     *
     * @return UserId - 操作者
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置操作者
     *
     * @param userid 操作者
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取操作名称
     *
     * @return OperateName - 操作名称
     */
    public String getOperatename() {
        return operatename;
    }

    /**
     * 设置操作名称
     *
     * @param operatename 操作名称
     */
    public void setOperatename(String operatename) {
        this.operatename = operatename;
    }

    /**
     * 获取操作对象Id
     *
     * @return ObjectId - 操作对象Id
     */
    public String getObjectid() {
        return objectid;
    }

    /**
     * 设置操作对象Id
     *
     * @param objectid 操作对象Id
     */
    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    /**
     * 获取操作描述
     *
     * @return OperateDesc - 操作描述
     */
    public String getOperatedesc() {
        return operatedesc;
    }

    /**
     * 设置操作描述
     *
     * @param operatedesc 操作描述
     */
    public void setOperatedesc(String operatedesc) {
        this.operatedesc = operatedesc;
    }

    /**
     * 获取操作时间
     *
     * @return OperateTime - 操作时间
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
     * 设置操作时间
     *
     * @param operatetime 操作时间
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }
}