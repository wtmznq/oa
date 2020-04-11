package org.java.service.impl;

import org.java.dao.UserinfoMapper;
import org.java.entity.Userinfo;
import org.java.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserinfoMapper userInfoMapper;

    @Override
    public Userinfo login(String userName) {
        Userinfo userinfo = userInfoMapper.findUserinfoByName(userName);
        System.out.println(userinfo.toString());
        return userinfo;
    }
}
