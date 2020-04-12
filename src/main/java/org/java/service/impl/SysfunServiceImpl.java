package org.java.service.impl;

import org.java.dao.SysfunMapper;
import org.java.entity.Sysfun;
import org.java.service.SysfunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysfunServiceImpl implements SysfunService {


    @Autowired
    private SysfunMapper sysfunMapper;

    @Override
    public List<Sysfun> loadSysfun(String userName) {
        List<Sysfun> menus = sysfunMapper.findSysfunByUserName(userName);
        return menus;
    }
}
