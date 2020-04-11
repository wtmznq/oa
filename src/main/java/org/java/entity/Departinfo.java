package org.java.entity;

import javax.persistence.*;

public class Departinfo {
    /**
     * 部门id
     */
    @Id
    @Column(name = "DepartId")
    private Integer departid;

    /**
     * 部门名称
     */
    @Column(name = "DepartName")
    private String departname;

    /**
     * 部门负责人,表UserInfo外键，对应UserId字段
     */
    @Column(name = "PrincipalUser")
    private String principaluser;

    /**
     * 联系电话
     */
    @Column(name = "ConnectTelNo")
    private String connecttelno;

    /**
     * 移动电话
     */
    @Column(name = "ConnectMobileTelNo")
    private String connectmobiletelno;

    /**
     * 传真
     */
    @Column(name = "Faxes")
    private String faxes;

    /**
     * 所属机构,表BranchInfo的外键，对应BranchId字段
     */
    @Column(name = "BranchId")
    private Integer branchid;

    /**
     * 获取部门id
     *
     * @return DepartId - 部门id
     */
    public Integer getDepartid() {
        return departid;
    }

    /**
     * 设置部门id
     *
     * @param departid 部门id
     */
    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    /**
     * 获取部门名称
     *
     * @return DepartName - 部门名称
     */
    public String getDepartname() {
        return departname;
    }

    /**
     * 设置部门名称
     *
     * @param departname 部门名称
     */
    public void setDepartname(String departname) {
        this.departname = departname;
    }

    /**
     * 获取部门负责人,表UserInfo外键，对应UserId字段
     *
     * @return PrincipalUser - 部门负责人,表UserInfo外键，对应UserId字段
     */
    public String getPrincipaluser() {
        return principaluser;
    }

    /**
     * 设置部门负责人,表UserInfo外键，对应UserId字段
     *
     * @param principaluser 部门负责人,表UserInfo外键，对应UserId字段
     */
    public void setPrincipaluser(String principaluser) {
        this.principaluser = principaluser;
    }

    /**
     * 获取联系电话
     *
     * @return ConnectTelNo - 联系电话
     */
    public String getConnecttelno() {
        return connecttelno;
    }

    /**
     * 设置联系电话
     *
     * @param connecttelno 联系电话
     */
    public void setConnecttelno(String connecttelno) {
        this.connecttelno = connecttelno;
    }

    /**
     * 获取移动电话
     *
     * @return ConnectMobileTelNo - 移动电话
     */
    public String getConnectmobiletelno() {
        return connectmobiletelno;
    }

    /**
     * 设置移动电话
     *
     * @param connectmobiletelno 移动电话
     */
    public void setConnectmobiletelno(String connectmobiletelno) {
        this.connectmobiletelno = connectmobiletelno;
    }

    /**
     * 获取传真
     *
     * @return Faxes - 传真
     */
    public String getFaxes() {
        return faxes;
    }

    /**
     * 设置传真
     *
     * @param faxes 传真
     */
    public void setFaxes(String faxes) {
        this.faxes = faxes;
    }

    /**
     * 获取所属机构,表BranchInfo的外键，对应BranchId字段
     *
     * @return BranchId - 所属机构,表BranchInfo的外键，对应BranchId字段
     */
    public Integer getBranchid() {
        return branchid;
    }

    /**
     * 设置所属机构,表BranchInfo的外键，对应BranchId字段
     *
     * @param branchid 所属机构,表BranchInfo的外键，对应BranchId字段
     */
    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }
}