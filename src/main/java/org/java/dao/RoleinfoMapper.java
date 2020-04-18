package org.java.dao;

import org.java.entity.Roleinfo;
import tk.mybatis.MyMapper;

import java.util.List;
import java.util.Map;

public interface RoleinfoMapper extends MyMapper<Roleinfo> {

    public List<Roleinfo> findAll();
}