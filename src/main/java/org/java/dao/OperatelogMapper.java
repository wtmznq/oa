package org.java.dao;

import org.apache.ibatis.annotations.Param;
import org.java.entity.Operatelog;
import tk.mybatis.MyMapper;

import java.util.List;
import java.util.Map;

public interface OperatelogMapper extends MyMapper<Operatelog> {

    public List<Map> findLog(@Param("param") Map param);
}