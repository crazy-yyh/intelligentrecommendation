package com.btmf.business.service.slaver.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.OrderMarketingDao;
import com.btmf.business.entity.slaver.OrderMarketingEntity;
import com.btmf.business.service.slaver.OrderMarketingService;
import org.springframework.stereotype.Service;

@Service("orderMarketingService")
public class OrderMarketingServiceImpl extends ServiceImpl<OrderMarketingDao, OrderMarketingEntity> implements OrderMarketingService {



}