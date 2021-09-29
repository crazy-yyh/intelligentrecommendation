package com.btmf.business.service.slaver.impl;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.CustomerInfoDao;
import com.btmf.business.entity.slaver.CustomerInfoEntity;
import com.btmf.business.service.slaver.CustomerInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerInfoService")
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoDao, CustomerInfoEntity> implements CustomerInfoService {

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
}