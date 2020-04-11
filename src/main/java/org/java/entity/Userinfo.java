package org.java.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserInfo")
public class Userinfo {
    /**
     * 用户唯一标识
     */
    @Id
    @Column(name = "UserId")
    private String userid;

    /**
     * 真实姓名
     */
    @Column(name = "UserName")
    private String username;

    /**
     * 密码
     */
    @Column(name = "PassWord")
    private String password;

    /**
     * 所在部门，对映部门表DepartId
     */
    @Column(name = "DepartId")
    private Integer departid;

    /**
     * 性别,1男性，2女性
     */
    @Column(name = "Gender")
    private Integer gender;

    /**
     * 用户角色，roleinfo的外键，对应roleinfo表的roleid
     */
    @Column(name = "RoleId")
    private Integer roleid;

    /**
     * 用户状态,表UserState的外键，对应UserStateId 字段
     */
    @Column(name = "UserState")
    private Integer userstate;

    /**
     * 获取用户唯一标识
     *
     * @return UserId - 用户唯一标识
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户唯一标识
     *
     * @param userid 用户唯一标识
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取真实姓名
     *
     * @return UserName - 真实姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置真实姓名
     *
     * @param username 真实姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return PassWord - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取所在部门，对映部门表DepartId
     *
     * @return DepartId - 所在部门，对映部门表DepartId
     */
    public Integer getDepartid() {
        return departid;
    }

    /**
     * 设置所在部门，对映部门表DepartId
     *
     * @param departid 所在部门，对映部门表DepartId
     */
    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    /**
     * 获取性别,1男性，2女性
     *
     * @return Gender - 性别,1男性，2女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别,1男性，2女性
     *
     * @param gender 性别,1男性，2女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取用户角色，roleinfo的外键，对应roleinfo表的roleid
     *
     * @return RoleId - 用户角色，roleinfo的外键，对应roleinfo表的roleid
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置用户角色，roleinfo的外键，对应roleinfo表的roleid
     *
     * @param roleid 用户角色，roleinfo的外键，对应roleinfo表的roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取用户状态,表UserState的外键，对应UserStateId 字段
     *
     * @return UserState - 用户状态,表UserState的外键，对应UserStateId 字段
     */
    public Integer getUserstate() {
        return userstate;
    }

    /**
     * 设置用户状态,表UserState的外键，对应UserStateId 字段
     *
     * @param userstate 用户状态,表UserState的外键，对应UserStateId 字段
     */
    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }
}