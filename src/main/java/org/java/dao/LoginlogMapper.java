package org.java.dao;

import org.apache.ibatis.annotations.Param;
import org.java.entity.Loginlog;
import tk.mybatis.MyMapper;

import java.util.List;
import java.util.Map;

public interface LoginlogMapper extends MyMapper<Loginlog> {

    public List<Map> findLog(@Param("param") Map map);
}