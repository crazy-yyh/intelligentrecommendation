package com.btmf.business.service.master.impl;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.master.DtDailyDao;
import com.btmf.business.entity.master.DtDailyEntity;
import com.btmf.business.service.master.DtDailyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dtDailyService")
public class DtDailyServiceImpl extends ServiceImpl<DtDailyDao, DtDailyEntity> implements DtDailyService {


    @Override
    public List<Integer> jobUidList() {
        return null;
    }

    @Override
    public List<Integer> queryQualificationsNum(JSONObject jsonObject) {


        String city = "";
        String area = "";

        String prov = jsonObject.getString("prov");
        System.out.println("初始化省份");
        String cityArray = jsonObject.getString("city");
        //        for (int i = 0; i < cityArray.size(); i++) {
        //            city = cityArray.get(i).toString()+"|";
        //        }
        System.out.println("初始化市区");

        String areaArray = jsonObject.getString("area");

        System.out.println("初始化地区，开始查询，请稍后。。。。。。");

        return baseMapper.queryQualificationsNum(prov,city,area);


    }
}