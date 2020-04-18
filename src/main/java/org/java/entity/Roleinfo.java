package org.java.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
@Table(name = "RoleInfo")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Roleinfo {
    /**
     * 角色id
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    @Column(name = "RoleId")
    private Integer roleid;

    /**
     * 角色名称
     */
    @Column(name = "RoleName")
    private String rolename;

    /**
     * 角色描述
     */
    @Column(name = "RoleDesc")
    private String roledesc;

    /**
     * 获取角色id
     *
     * @return RoleId - 角色id
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置角色id
     *
     * @param roleid 角色id
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取角色名称
     *
     * @return RoleName - 角色名称
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 设置角色名称
     *
     * @param rolename 角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * 获取角色描述
     *
     * @return RoleDesc - 角色描述
     */
    public String getRoledesc() {
        return roledesc;
    }

    /**
     * 设置角色描述
     *
     * @param roledesc 角色描述
     */
    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }
}