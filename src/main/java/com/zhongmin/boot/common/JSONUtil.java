package com.zhongmin.boot.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Iterator;

public class JSONUtil {
	 /**
     * 将json转化为实体POJO
     * @param jsonStr
     * @param obj
     * @return
     */
    public static<T> Object JSONToObj(String jsonStr,Class<T> obj) {
    	ParserConfig.getGlobalInstance().setAsmEnable(false);    //解决反序列化
        T t = null;
        try {
            t = JSON.parseObject(jsonStr, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
     
    /**
     * 将实体POJO转化为JSON
     * @param obj
     * @return
     * @throws JSONException
     * @throws IOException
     */
    public static String ObjectToJson(Object obj) throws JSONException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = "";
        jsonStr =  JSON.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect);
        return jsonStr;
    }

    public static void main(String[] args) {
    	String jsonStr = "{\"id\":\"3\",\"name\":\"bob\",\"pass\":\"123\"}";  
        JSONObject jsonObj = JSONObject.parseObject(jsonStr);
        System.out.println(jsonObj.get("name"));  
        String arrStr = "[{\"id\":\"3\",\"name\":\"bob\",\"pass\":\"123\"},{\"id\":\"4\",\"name\":\"lancy\",\"pass\":\"134\"}]";  
        JSONArray jsonArr = JSONArray.parseArray(arrStr);
        System.out.println(jsonArr.getJSONObject(1).get("name"));  
        Iterator<Object> it = jsonArr.iterator();  
        while(it.hasNext()){  
            JSONObject obj = (JSONObject)it.next();
            obj.replace("name", "yaodaoji");
            System.out.println("name:"+obj.get("name")+" pass:"+obj.get("pass"));  
        }  
	}
    
}

