package com.btmf.business.service.slaver.impl;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.CustomerInfoDao;
import com.btmf.business.entity.master.UpKafkaEntity;
import com.btmf.business.entity.slaver.CustomerInfoEntity;
import com.btmf.business.service.slaver.CustomerInfoService;
import com.btmf.business.utils.JsonObjectUtil;
import com.btmf.business.utils.KafkaUtil;
import io.swagger.models.auth.In;
import org.apache.kafka.clients.producer.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Service("customerInfoService")
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoDao, CustomerInfoEntity> implements CustomerInfoService {


    private JsonObjectUtil jsonObjectUtil;

    private KafkaUtil kafkaUtil;

    /**
     * 信E贷黑名单 1
     * @return
     */
    @Override
    public List<Integer> exceptStatusData() {
        return baseMapper.exceptStatusData();
    }

    @Override
    public List<Integer> exceptBlackData() {
        return baseMapper.exceptBlackData();
    }

    /**
     * 查询平安产品
     * @param jsonObject
     * @return
     */
    @Override
    public  List<Integer>  queryPinAnProduct(JSONObject jsonObject) {

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

        return baseMapper.queryPinAnProductNum(prov,cityArray,areaArray);
    }

    /**
     * 查询数据，，准备分发数据
     * @param jsonObject
     * @return
     */
    @Override
    public Boolean distribute_PinAn_Data(JSONObject jsonObject) {

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