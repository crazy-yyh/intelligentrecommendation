package com.btmf.business.service.slaver.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.OrderOpportunityDao;
import com.btmf.business.entity.slaver.OrderOpportunityEntity;
import com.btmf.business.service.slaver.OrderOpportunityService;
import org.springframework.stereotype.Service;

@Service("orderOpportunityService")
public class OrderOpportunityServiceImpl extends ServiceImpl<OrderOpportunityDao, OrderOpportunityEntity> implements OrderOpportunityService {



}