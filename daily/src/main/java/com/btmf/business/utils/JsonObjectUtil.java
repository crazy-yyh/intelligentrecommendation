package com.btmf.business.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class JsonObjectUtil {

    private Map<String,String> map = new HashMap<>();


    public Map<String,String> parseObject(JSONObject jsonObject){

        //TODO 省市区解析
        String prov = jsonObject.getString("prov");


        System.out.println("初始化省份");
        String city = jsonObject.getString("city");

        String userId = jsonObject.getString("userId");

        String recomment_desc = jsonObject.getString("recomment_desc");

        System.out.println("初始化市区");

        String areaArray = jsonObject.getString("area");

        System.out.println("初始化地区，开始查询，请稍后。。。。。。");

        map.put("prov",prov);
        map.put("city",city);
        map.put("userId",userId);
        map.put("recomment_desc",recomment_desc);
        map.put("area",areaArray);

        return map;

    }
}
