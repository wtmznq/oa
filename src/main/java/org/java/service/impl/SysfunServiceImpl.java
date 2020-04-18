package org.java.service.impl;

import org.java.dao.SysfunMapper;
import org.java.entity.Roleright;
import org.java.entity.Sysfun;
import org.java.service.RolerightService;
import org.java.service.SysfunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysfunServiceImpl implements SysfunService {


    @Autowired
    private SysfunMapper sysfunMapper;
    @Autowired
    private RolerightService rolerightService;

    @Override
    public List<Sysfun> loadSysfun(String userName) {
        List<Sysfun> menus = sysfunMapper.findSysfunByUserName(userName);
        return menus;
    }

    @Override
    public Map loadTree(Integer roleid) {
        List<Sysfun> list =sysfunMapper.selectAll();
        List<Roleright> rolerights = rolerightService.findByRoleId(roleid);
        Map map = new HashMap();
        List<Map> listNode = new ArrayList<>();
        map.put("code",0);
        map.put("msg","操作成功");
        for (Sysfun s:list
             ) {
            Map map1= new HashMap<>();
            map1.put("id",s.getNodeid());
            map1.put("title",s.getDisplayname());
            map1.put("checkArr","0");
            map1.put("parentId",s.getParentnodeid());
            for (Roleright r:rolerights
                 ) {
                if (r.getNodeid()==s.getNodeid()){
                    Map checkArr=new HashMap();
                    checkArr.put("type","0");
                    checkArr.put("checked","1");
                    map1.put("checkArr",checkArr);
                    break;
                }
            }
            listNode.add(map1);
        }
        map.put("data",listNode);
        return map;
    }
}
