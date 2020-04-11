package org.java.entity;

import java.util.Date;
import javax.persistence.*;

public class Accessoryfile {
    /**
     * 文件附件Id
     */
    @Id
    @Column(name = "AccessoryId")
    private Integer accessoryid;

    /**
     * 文件Id,表FileInfo的外键，对应FileId 字段
     */
    @Column(name = "FileId")
    private Integer fileid;

    /**
     * 附件名称
     */
    @Column(name = "AccessoryName")
    private String accessoryname;

    /**
     * 附件大小
     */
    @Column(name = "AccessorySize")
    private Integer accessorysize;

    /**
     * 附件类型,FileTypeInfo表的外键，对应FileTypeId字段
     */
    @Column(name = "AccessoryType")
    private Integer accessorytype;

    /**
     * 创建日期
     */
    @Column(name = "CreateDate")
    private Date createdate;

    /**
     * 附件路径
     */
    @Column(name = "AccessoryPath")
    private String accessorypath;

    /**
     * 获取文件附件Id
     *
     * @return AccessoryId - 文件附件Id
     */
    public Integer getAccessoryid() {
        return accessoryid;
    }

    /**
     * 设置文件附件Id
     *
     * @param accessoryid 文件附件Id
     */
    public void setAccessoryid(Integer accessoryid) {
        this.accessoryid = accessoryid;
    }

    /**
     * 获取文件Id,表FileInfo的外键，对应FileId 字段
     *
     * @return FileId - 文件Id,表FileInfo的外键，对应FileId 字段
     */
    public Integer getFileid() {
        return fileid;
    }

    /**
     * 设置文件Id,表FileInfo的外键，对应FileId 字段
     *
     * @param fileid 文件Id,表FileInfo的外键，对应FileId 字段
     */
    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    /**
     * 获取附件名称
     *
     * @return AccessoryName - 附件名称
     */
    public String getAccessoryname() {
        return accessoryname;
    }

    /**
     * 设置附件名称
     *
     * @param accessoryname 附件名称
     */
    public void setAccessoryname(String accessoryname) {
        this.accessoryname = accessoryname;
    }

    /**
     * 获取附件大小
     *
     * @return AccessorySize - 附件大小
     */
    public Integer getAccessorysize() {
        return accessorysize;
    }

    /**
     * 设置附件大小
     *
     * @param accessorysize 附件大小
     */
    public void setAccessorysize(Integer accessorysize) {
        this.accessorysize = accessorysize;
    }

    /**
     * 获取附件类型,FileTypeInfo表的外键，对应FileTypeId字段
     *
     * @return AccessoryType - 附件类型,FileTypeInfo表的外键，对应FileTypeId字段
     */
    public Integer getAccessorytype() {
        return accessorytype;
    }

    /**
     * 设置附件类型,FileTypeInfo表的外键，对应FileTypeId字段
     *
     * @param accessorytype 附件类型,FileTypeInfo表的外键，对应FileTypeId字段
     */
    public void setAccessorytype(Integer accessorytype) {
        this.accessorytype = accessorytype;
    }

    /**
     * 获取创建日期
     *
     * @return CreateDate - 创建日期
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置创建日期
     *
     * @param createdate 创建日期
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取附件路径
     *
     * @return AccessoryPath - 附件路径
     */
    public String getAccessorypath() {
        return accessorypath;
    }

    /**
     * 设置附件路径
     *
     * @param accessorypath 附件路径
     */
    public void setAccessorypath(String accessorypath) {
        this.accessorypath = accessorypath;
    }
}