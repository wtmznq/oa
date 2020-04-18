package org.java.web;

import org.java.service.OperatelogService;
import org.java.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/operateLog")
public class OperatelogController {

    @Autowired
    private OperatelogService operatelogService;

    @GetMapping("load")
    public ResultVo<Map> loadLog(Integer page,Integer limit,String startTime,String endTime){
        Map map = new HashMap();
        map.put("startTime",startTime);
        map.put("endTime",endTime);

        ResultVo<Map> resultVo = operatelogService.loadLog(page, limit, map);
        return resultVo;
    }
}
