package com.zhongmin.boot.service;

import com.zhongmin.boot.domain.ZMSafeguard;

import java.util.List;

public interface ZMSafeguardService {
    public ZMSafeguard selectById(Long id);
    public List<ZMSafeguard> selectAll();
}
