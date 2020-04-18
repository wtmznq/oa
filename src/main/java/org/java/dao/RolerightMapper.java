package org.java.dao;

import org.apache.ibatis.annotations.Param;
import org.java.entity.Roleright;
import tk.mybatis.MyMapper;

import java.util.List;

public interface RolerightMapper extends MyMapper<Roleright> {


    public List<Roleright> findByRoleId(@Param("roleid") Integer roleid);
    public void delByRoleId(@Param("roleid") Integer roleid);
}