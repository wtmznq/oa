package org.java.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java.dao.LoginlogMapper;
import org.java.entity.Loginlog;
import org.java.entity.Roleinfo;
import org.java.service.LoginLogService;
import org.java.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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


    @Override
    public ResultVo<Map> findLog(Integer page, Integer limit, Map map) {
        PageHelper.startPage(page,limit);
        PageInfo<Map> pageInfo = new PageInfo<>(loginlogMapper.findLog(map));

        ResultVo<Map> resultVo = new ResultVo<>();
        resultVo.setData(pageInfo.getList());
        resultVo.setCount(pageInfo.getTotal());
        return resultVo;
    }

    @Override
    @Transactional
    public void del(String log) {
        List<Map> logs = JSONObject.parseArray(log, Map.class);
        for (Map m:logs
             ) {
            loginlogMapper.deleteByPrimaryKey(m.get("loginId"));
        }
    }
}
