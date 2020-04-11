package org.java.entity;

import javax.persistence.*;

public class Roleright {
    /**
     * 角色权限id
     */
    @Id
    @Column(name = "RoleRightId")
    private Integer rolerightid;

    /**
     * 角色id,表RoleInfo的外键，对应RoleId
     */
    @Column(name = "RoleId")
    private Integer roleid;

    /**
     * 菜单节点id,表SysFun的外键，对应NodeId 
     */
    @Column(name = "NodeId")
    private Integer nodeid;

    /**
     * 获取角色权限id
     *
     * @return RoleRightId - 角色权限id
     */
    public Integer getRolerightid() {
        return rolerightid;
    }

    /**
     * 设置角色权限id
     *
     * @param rolerightid 角色权限id
     */
    public void setRolerightid(Integer rolerightid) {
        this.rolerightid = rolerightid;
    }

    /**
     * 获取角色id,表RoleInfo的外键，对应RoleId
     *
     * @return RoleId - 角色id,表RoleInfo的外键，对应RoleId
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置角色id,表RoleInfo的外键，对应RoleId
     *
     * @param roleid 角色id,表RoleInfo的外键，对应RoleId
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取菜单节点id,表SysFun的外键，对应NodeId 
     *
     * @return NodeId - 菜单节点id,表SysFun的外键，对应NodeId 
     */
    public Integer getNodeid() {
        return nodeid;
    }

    /**
     * 设置菜单节点id,表SysFun的外键，对应NodeId 
     *
     * @param nodeid 菜单节点id,表SysFun的外键，对应NodeId 
     */
    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }
}