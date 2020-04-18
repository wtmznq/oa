package org.java.entity;

import javax.persistence.*;
@Table(name = "SysFun")
public class Sysfun {
    /**
     * 菜单节点id
     */
    @Id
    @Column(name = "NodeId")
    private Integer nodeid;

    /**
     * 菜单名称
     */
    @Column(name = "DisplayName")
    private String displayname;

    /**
     * 菜单连接地址
     */
    @Column(name = "NodeURL")
    private String nodeurl;

    /**
     * 菜单显示顺序
     */
    @Column(name = "DisplayOrder")
    private Integer displayorder;

    /**
     * 父节点id
     */
    @Column(name = "ParentNodeId")
    private Integer parentnodeid;

    /**
     * 获取菜单节点id
     *
     * @return NodeId - 菜单节点id
     */
    public Integer getNodeid() {
        return nodeid;
    }

    /**
     * 设置菜单节点id
     *
     * @param nodeid 菜单节点id
     */
    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }

    /**
     * 获取菜单名称
     *
     * @return DisplayName - 菜单名称
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * 设置菜单名称
     *
     * @param displayname 菜单名称
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    /**
     * 获取菜单连接地址
     *
     * @return NodeURL - 菜单连接地址
     */
    public String getNodeurl() {
        return nodeurl;
    }

    /**
     * 设置菜单连接地址
     *
     * @param nodeurl 菜单连接地址
     */
    public void setNodeurl(String nodeurl) {
        this.nodeurl = nodeurl;
    }

    /**
     * 获取菜单显示顺序
     *
     * @return DisplayOrder - 菜单显示顺序
     */
    public Integer getDisplayorder() {
        return displayorder;
    }

    /**
     * 设置菜单显示顺序
     *
     * @param displayorder 菜单显示顺序
     */
    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    /**
     * 获取父节点id
     *
     * @return ParentNodeId - 父节点id
     */
    public Integer getParentnodeid() {
        return parentnodeid;
    }

    /**
     * 设置父节点id
     *
     * @param parentnodeid 父节点id
     */
    public void setParentnodeid(Integer parentnodeid) {
        this.parentnodeid = parentnodeid;
    }
}