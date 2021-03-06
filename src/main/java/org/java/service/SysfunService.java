package org.java.service;

import org.java.entity.Sysfun;

import java.util.List;
import java.util.Map;

public interface SysfunService {

    /**
     * 加载菜单
     * @param userName 用户id
     * @return
     */
    public List<Sysfun> loadSysfun(String userName);


    public Map loadTree(Integer roleid);
}
