package com.btmf.business.service.slaver.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.OrdersDao;
import com.btmf.business.entity.slaver.OrdersEntity;
import com.btmf.business.service.slaver.OrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ordersService")
public class OrdersServiceImpl extends ServiceImpl<OrdersDao, OrdersEntity> implements OrdersService {


    @Override
    public List<Integer> NoQualifications(Integer day, String[]... args) {

        return baseMapper.NoQualifications(day);


    }

    /**
     * 信E贷黑名单 4
     * @return
     */
    @Override
    public List<Integer> exceptData() {
        return baseMapper.exceptData();
    }
}