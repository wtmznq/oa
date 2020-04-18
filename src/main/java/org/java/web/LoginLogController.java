package org.java.web;

import org.apache.shiro.crypto.hash.Hash;
import org.java.service.LoginLogService;
import org.java.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/loginLog")
public class LoginLogController {

    @Autowired
    private LoginLogService loginLogService;

    @GetMapping("init")
    public ResultVo<Map> init(Integer page, Integer limit,String startTime,String endTime){
        Map map = new HashMap();
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        ResultVo<Map> log = loginLogService.findLog(page, limit, map);
        return log;
    }

    @GetMapping("del")
    public void del(String log){
        System.out.println(log);
        loginLogService.del(log);
    }
}
