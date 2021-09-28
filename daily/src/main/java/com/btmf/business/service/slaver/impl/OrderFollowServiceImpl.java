package com.btmf.business.service.slaver.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.OrderFollowDao;
import com.btmf.business.entity.slaver.OrderFollowEntity;
import com.btmf.business.service.slaver.OrderFollowService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderFollowService")
public class OrderFollowServiceImpl extends ServiceImpl<OrderFollowDao, OrderFollowEntity> implements OrderFollowService {


    /**
     * 信E贷黑名单 3
     * @return
     */
    @Override
    public List<Integer> exceptData() {
        return baseMapper.exceptData();
    }
}