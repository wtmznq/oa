package org.java.dao;

import org.apache.ibatis.annotations.Param;
import org.java.entity.Sysfun;
import tk.mybatis.MyMapper;

import java.util.List;
import java.util.Map;

public interface SysfunMapper extends MyMapper<Sysfun> {
    /**
     * 更具用户名查找左侧菜单
     * @param userName 用户名
     * @return
     */
    public List<Sysfun> findSysfunByUserName(@Param("userName") String userName);
}