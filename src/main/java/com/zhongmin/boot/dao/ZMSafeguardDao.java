package com.zhongmin.boot.dao;

import com.zhongmin.boot.domain.ZMSafeguard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZMSafeguardDao {

    ZMSafeguard selectById(Long id);

    List<ZMSafeguard> selectAll();

}
