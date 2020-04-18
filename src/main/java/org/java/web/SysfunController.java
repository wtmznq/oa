package org.java.web;

import org.java.service.SysfunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Sysfun")
public class SysfunController {

    @Autowired
    private SysfunService sysfunService;

    @GetMapping("load")
    public Map loadTree(Integer roleid){
        Map map = sysfunService.loadTree(roleid);
        System.out.println(map.toString());
        return map;
    }
}
