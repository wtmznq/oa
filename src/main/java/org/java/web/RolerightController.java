package org.java.web;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.java.entity.Roleright;
import org.java.service.RolerightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Roleright")
public class RolerightController {

    @Autowired
    private RolerightService rolerightService;

    @PostMapping("update")
    public void update(Integer roleid,String node){
        List list = JSONObject.parseArray(node);
        rolerightService.update(roleid,list);
//        rolerightService.update(roleid,nodeList);
    }
}
