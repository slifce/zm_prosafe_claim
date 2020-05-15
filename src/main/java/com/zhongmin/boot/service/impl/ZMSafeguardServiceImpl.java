package com.zhongmin.boot.service.impl;

import com.zhongmin.boot.dao.ZMSafeguardDao;
import com.zhongmin.boot.domain.ZMSafeguard;
import com.zhongmin.boot.service.ZMSafeguardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZMSafeguardServiceImpl implements ZMSafeguardService{

    @Autowired
    private ZMSafeguardDao zmSafeguardDao;

    @Override
    public ZMSafeguard selectById(Long id) {
        return zmSafeguardDao.selectById(id);
    }

    @Override
    public List<ZMSafeguard> selectAll() {
        return zmSafeguardDao.selectAll();
    }
}
