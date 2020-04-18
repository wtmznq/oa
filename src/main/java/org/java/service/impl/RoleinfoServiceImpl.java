package org.java.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java.dao.RoleinfoMapper;
import org.java.entity.Roleinfo;
import org.java.service.RoleinfoService;
import org.java.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleinfoServiceImpl implements RoleinfoService {

    @Autowired
    private RoleinfoMapper roleinfoMapper;

    /**
     * 查询角色信息表
     * @param page
     * @param limit
     * @return
     */
    @Override
    public ResultVo<Roleinfo> findRoleinfo(Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        PageInfo<Roleinfo> pageInfo = new PageInfo<>(roleinfoMapper.findAll());

        ResultVo<Roleinfo> resultVo = new ResultVo<>();
        resultVo.setData(pageInfo.getList());
        resultVo.setCount(pageInfo.getTotal());
        return resultVo;
    }

    /**
     * 添加角色信息表
     * @param roleinfo
     */
    @Override
    public void add(Roleinfo roleinfo) {
        roleinfoMapper.insert(roleinfo);
    }

    @Override
    public void del(Integer roleId) {
        roleinfoMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public void update(Roleinfo roleinfo) {
        roleinfoMapper.updateByPrimaryKey(roleinfo);
    }
}
