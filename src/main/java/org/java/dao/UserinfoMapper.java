package org.java.dao;

import org.apache.ibatis.annotations.Param;
import org.java.entity.Userinfo;
import tk.mybatis.MyMapper;

public interface UserinfoMapper extends MyMapper<Userinfo> {
    /**
     * 更具用户名返回用户信息
     * @param userName 用户名
     * @return
     */
    public Userinfo findUserinfoByName(@Param("userName") String userName);
}