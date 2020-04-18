package org.java.service;

import org.java.entity.Roleright;

import java.util.List;

public interface RolerightService {

    public List<Roleright> findByRoleId(Integer roleid);

    public void update(Integer RoleId,List nodeId);

}
