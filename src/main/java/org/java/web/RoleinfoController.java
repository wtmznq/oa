package org.java.web;

import org.java.entity.Roleinfo;
import org.java.service.RoleinfoService;
import org.java.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roleInfo")
public class RoleinfoController {

    @Autowired
    private RoleinfoService roleinfoService;

    @GetMapping("/init")
    public ResultVo<Roleinfo> findList(Integer page,Integer limit){
        ResultVo<Roleinfo> resultVo = roleinfoService.findRoleinfo(page,limit);
        return resultVo;
    }

    @PostMapping("add")
    public void add(Roleinfo roleinfo){
        System.out.println(roleinfo.toString());
        roleinfoService.add(roleinfo);
    }

    @PostMapping("del")
    public void del(Integer roleId){
        roleinfoService.del(roleId);
    }

    @PostMapping("update")
    public void update(Roleinfo roleinfo){
        roleinfoService.update(roleinfo);
    }
}
