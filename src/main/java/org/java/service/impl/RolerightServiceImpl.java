package org.java.service.impl;

import org.java.dao.RolerightMapper;
import org.java.entity.Roleright;
import org.java.service.RolerightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RolerightServiceImpl implements RolerightService {

    @Autowired
    private RolerightMapper rolerightMapper;

    @Override
    public List<Roleright> findByRoleId(Integer roleid) {
        List<Roleright> rolerights = rolerightMapper.findByRoleId(roleid);
        return rolerights;
    }

    @Override
    @Transactional
    public void update(Integer roleId, List nodeId) {
        rolerightMapper.delByRoleId(roleId);
        for (Object n:nodeId
             ) {
            Roleright roleright = new Roleright();
            roleright.setRoleid(roleId);
            roleright.setNodeid(Integer.valueOf(n.toString()));
            rolerightMapper.insert(roleright);
        }
    }
}
