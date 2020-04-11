package org.java.entity;

import java.util.Date;
import javax.persistence.*;

public class Fileinfo {
    /**
     * 文件Id
     */
    @Id
    @Column(name = "FileId")
    private Integer fileid;

    /**
     * 文件名称
     */
    @Column(name = "FileName")
    private String filename;

    /**
     * 文件类型,FileTypeInfo表的外键，对应FileTypeId字段
     */
    @Column(name = "FileType")
    private Integer filetype;

    /**
     * 备注
     */
    @Column(name = "Remark")
    private String remark;

    /**
     * 创建者
     */
    @Column(name = "FileOwner")
    private String fileowner;

    /**
     * 创建日期
     */
    @Column(name = "CreateDate")
    private Date createdate;

    /**
     * 父节点Id
     */
    @Column(name = "ParentId")
    private Integer parentid;

    /**
     * 文件路径
     */
    @Column(name = "FilePath")
    private String filepath;

    /**
     * 是否已删除。1：已删除、2：未删除
     */
    @Column(name = "IfDelete")
    private Integer ifdelete;

    /**
     * 获取文件Id
     *
     * @return FileId - 文件Id
     */
    public Integer getFileid() {
        return fileid;
    }

    /**
     * 设置文件Id
     *
     * @param fileid 文件Id
     */
    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    /**
     * 获取文件名称
     *
     * @return FileName - 文件名称
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置文件名称
     *
     * @param filename 文件名称
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取文件类型,FileTypeInfo表的外键，对应FileTypeId字段
     *
     * @return FileType - 文件类型,FileTypeInfo表的外键，对应FileTypeId字段
     */
    public Integer getFiletype() {
        return filetype;
    }

    /**
     * 设置文件类型,FileTypeInfo表的外键，对应FileTypeId字段
     *
     * @param filetype 文件类型,FileTypeInfo表的外键，对应FileTypeId字段
     */
    public void setFiletype(Integer filetype) {
        this.filetype = filetype;
    }

    /**
     * 获取备注
     *
     * @return Remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建者
     *
     * @return FileOwner - 创建者
     */
    public String getFileowner() {
        return fileowner;
    }

    /**
     * 设置创建者
     *
     * @param fileowner 创建者
     */
    public void setFileowner(String fileowner) {
        this.fileowner = fileowner;
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
     * 获取父节点Id
     *
     * @return ParentId - 父节点Id
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父节点Id
     *
     * @param parentid 父节点Id
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取文件路径
     *
     * @return FilePath - 文件路径
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * 设置文件路径
     *
     * @param filepath 文件路径
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    /**
     * 获取是否已删除。1：已删除、2：未删除
     *
     * @return IfDelete - 是否已删除。1：已删除、2：未删除
     */
    public Integer getIfdelete() {
        return ifdelete;
    }

    /**
     * 设置是否已删除。1：已删除、2：未删除
     *
     * @param ifdelete 是否已删除。1：已删除、2：未删除
     */
    public void setIfdelete(Integer ifdelete) {
        this.ifdelete = ifdelete;
    }
}