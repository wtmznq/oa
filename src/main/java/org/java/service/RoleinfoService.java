package org.java.service;

import org.java.entity.Roleinfo;
import org.java.vo.ResultVo;


public interface RoleinfoService {

    public ResultVo<Roleinfo> findRoleinfo(Integer page, Integer limit);

    public void add(Roleinfo roleinfo);

    public void  del(Integer roleId);

    public void update(Roleinfo roleinfo);
}
