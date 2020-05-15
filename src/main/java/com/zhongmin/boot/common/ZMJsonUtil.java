package com.zhongmin.boot.common;

import com.alibaba.fastjson.JSON;

import java.io.IOException;

public class ZMJsonUtil extends JSON {
 
	/**
	 * 自动转换成obj
	 * @param obj
	 * @param code 状态码
	 * @param msg 状态码描述
	 * @return  附有状态码，状态信息
	 */
    public static<T> String ZMObjectToJson(T obj,int code,String msg){
    	String str="";
    	StaticEntity<T> entity=ZMJsonUtil.ZMObjectToEntity(obj,code,msg);
    		str=ZMJsonUtil.ZMStaticEntityToJson(entity);
       	return str;
    }

	/**
	 * 自动转换成obj
	 * @param obj
	 * @param code 状态码
	 * @param msg 状态码描述
	 * @return  附有状态码，状态信息
	 */
	public static<T> StaticEntity<T> ZMObjectToEntity(T obj,int code,String msg){
		StaticEntity<T> entity=new StaticEntity<T>();
		entity.setCode(code);
		entity.setMessage(msg);
		entity.setData(obj);
		return entity;
	}

	/**
	 *  staticEntity 转换成 json 格式字符串
	 * @param entity
	 * @return  json 格式字符串
	 */
	public static<T>  String ZMStaticEntityToJson(StaticEntity<T> entity){
		try {
			return JSONUtil.ObjectToJson(entity);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
