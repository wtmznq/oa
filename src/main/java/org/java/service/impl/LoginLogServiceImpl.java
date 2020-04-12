package org.java.service.impl;

import org.java.dao.LoginlogMapper;
import org.java.entity.Loginlog;
import org.java.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    private LoginlogMapper loginlogMapper;

    /**
     * 添加登录日志
     * @param loginlog 登录日志实体类
     */
    @Override
    public void addLog(Loginlog loginlog) {
        loginlogMapper.insert(loginlog);
    }
}
