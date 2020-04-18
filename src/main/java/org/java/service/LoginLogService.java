package org.java.service;

import org.java.entity.Loginlog;
import org.java.vo.ResultVo;

import java.util.List;
import java.util.Map;

public interface LoginLogService {


    /**
     * 添加登录日志日志
     */
    public void addLog(Loginlog loginlog);


    public ResultVo<Map> findLog(Integer page, Integer limit, Map map);


    public void del(String log);

}
