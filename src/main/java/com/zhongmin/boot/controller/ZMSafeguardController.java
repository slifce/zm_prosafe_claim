package com.zhongmin.boot.controller;

import com.zhongmin.boot.common.ZMJsonUtil;
import com.zhongmin.boot.domain.ZMSafeguard;
import com.zhongmin.boot.service.ZMSafeguardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2020/5/15.
 */
@RestController
@RequestMapping("/safeguard")
public class ZMSafeguardController {

    @Autowired
    private ZMSafeguardService zmSafeguardService;

    @ResponseBody
    @GetMapping("/list")
    //@RequiresPermissions("blog:bContent:bContent")
    public String list(){
        List<ZMSafeguard> zmSafeguardList = zmSafeguardService.selectAll();
        System.out.println(zmSafeguardList.size());
        System.out.println(213);
        return ZMJsonUtil.ZMObjectToJson(zmSafeguardList,200,"操作成功");
    }

    @ResponseBody
    @GetMapping("/query")
    public String selectById(){
        ZMSafeguard zmSafeguard = zmSafeguardService.selectById(329L);
        System.out.println(zmSafeguard.getSafeCodeZm());
        return ZMJsonUtil.ZMObjectToJson(zmSafeguard,200,"操作成功");
    }
}
