package org.java.entity;

import java.util.Date;
import javax.persistence.*;

public class Mynote {
    /**
     * 便签id
     */
    @Id
    @Column(name = "NoteId")
    private Integer noteid;

    /**
     * 便签标题
     */
    @Column(name = "NoteTitle")
    private String notetitle;

    /**
     * 便签内容
     */
    @Column(name = "NoteContent")
    private String notecontent;

    /**
     * 创建时间
     */
    @Column(name = "CreateTime")
    private Date createtime;

    /**
     * 创建者
     */
    @Column(name = "CreateUser")
    private String createuser;

    /**
     * 获取便签id
     *
     * @return NoteId - 便签id
     */
    public Integer getNoteid() {
        return noteid;
    }

    /**
     * 设置便签id
     *
     * @param noteid 便签id
     */
    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    /**
     * 获取便签标题
     *
     * @return NoteTitle - 便签标题
     */
    public String getNotetitle() {
        return notetitle;
    }

    /**
     * 设置便签标题
     *
     * @param notetitle 便签标题
     */
    public void setNotetitle(String notetitle) {
        this.notetitle = notetitle;
    }

    /**
     * 获取便签内容
     *
     * @return NoteContent - 便签内容
     */
    public String getNotecontent() {
        return notecontent;
    }

    /**
     * 设置便签内容
     *
     * @param notecontent 便签内容
     */
    public void setNotecontent(String notecontent) {
        this.notecontent = notecontent;
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
}