package org.java.service;

import org.java.vo.ResultVo;

import java.util.Map;

public interface OperatelogService {

    public ResultVo<Map> loadLog(Integer page,Integer limit,Map map);
}
