package com.btmf.business.service.master.impl;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.master.DtDailyDao;
import com.btmf.business.entity.master.DtDailyEntity;
import com.btmf.business.entity.master.UpKafkaEntity;
import com.btmf.business.service.master.DtDailyService;
import com.btmf.business.utils.JsonObjectUtil;
import com.btmf.business.utils.KafkaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("dtDailyService")
public class DtDailyServiceImpl extends ServiceImpl<DtDailyDao, DtDailyEntity> implements DtDailyService {

    private KafkaUtil kafkaUtil;

    private JsonObjectUtil jsonObjectUtil;

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

    @Override
    public Boolean distribute_Qualifications_Data(JSONObject jsonObject) {
        List<UpKafkaEntity> list = new ArrayList<>();
        UpKafkaEntity kafkaEntity = new UpKafkaEntity();

        Map<String, String> map = jsonObjectUtil.parseObject(jsonObject);

        List<Integer> integers = baseMapper.queryPinAnProductNum(map.get("prov"),map.get("city"),map.get("area"));

        for (int i = 0; i < integers.size(); i++) {
            kafkaEntity.setCustomerId(integers.get(i));
            kafkaEntity.setUserId(Integer.parseInt(map.get("userId")));
            kafkaEntity.setMarketRecommendDesc(map.get("recomment_desc"));
            list.add(kafkaEntity);
        }

        return kafkaUtil.distributeData(list);
    }
}