package org.java.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java.dao.OperatelogMapper;
import org.java.service.OperatelogService;
import org.java.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class OperatelogServiceImpl implements OperatelogService {

    @Autowired
    private OperatelogMapper operatelogMapper;

    @Override
    public ResultVo<Map> loadLog(Integer page,Integer limit,Map map) {
        PageHelper.startPage(page,limit);
        PageInfo<Map> pageInfo = new PageInfo<>(operatelogMapper.findLog(map));

        ResultVo<Map> resultVo = new ResultVo<>();
        resultVo.setData(pageInfo.getList());
        resultVo.setCount(pageInfo.getTotal());
        return resultVo;
    }
}
