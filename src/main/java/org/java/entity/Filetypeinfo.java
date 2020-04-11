package org.java.entity;

import javax.persistence.*;

public class Filetypeinfo {
    /**
     * 文件类型id
     */
    @Id
    @Column(name = "FileTypeId")
    private Integer filetypeid;

    /**
     * 文件类型名
     */
    @Column(name = "FileTypeName")
    private String filetypename;

    /**
     * 文件类型对应的图标
     */
    @Column(name = "FileTypeImage")
    private String filetypeimage;

    /**
     * 文件类型后缀
     */
    @Column(name = "FileTypeSuffix")
    private String filetypesuffix;

    /**
     * 获取文件类型id
     *
     * @return FileTypeId - 文件类型id
     */
    public Integer getFiletypeid() {
        return filetypeid;
    }

    /**
     * 设置文件类型id
     *
     * @param filetypeid 文件类型id
     */
    public void setFiletypeid(Integer filetypeid) {
        this.filetypeid = filetypeid;
    }

    /**
     * 获取文件类型名
     *
     * @return FileTypeName - 文件类型名
     */
    public String getFiletypename() {
        return filetypename;
    }

    /**
     * 设置文件类型名
     *
     * @param filetypename 文件类型名
     */
    public void setFiletypename(String filetypename) {
        this.filetypename = filetypename;
    }

    /**
     * 获取文件类型对应的图标
     *
     * @return FileTypeImage - 文件类型对应的图标
     */
    public String getFiletypeimage() {
        return filetypeimage;
    }

    /**
     * 设置文件类型对应的图标
     *
     * @param filetypeimage 文件类型对应的图标
     */
    public void setFiletypeimage(String filetypeimage) {
        this.filetypeimage = filetypeimage;
    }

    /**
     * 获取文件类型后缀
     *
     * @return FileTypeSuffix - 文件类型后缀
     */
    public String getFiletypesuffix() {
        return filetypesuffix;
    }

    /**
     * 设置文件类型后缀
     *
     * @param filetypesuffix 文件类型后缀
     */
    public void setFiletypesuffix(String filetypesuffix) {
        this.filetypesuffix = filetypesuffix;
    }
}