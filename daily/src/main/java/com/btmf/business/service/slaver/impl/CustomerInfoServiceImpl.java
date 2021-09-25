package com.btmf.business.service.slaver.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.CustomerInfoDao;
import com.btmf.business.entity.slaver.CustomerInfoEntity;
import com.btmf.business.service.slaver.CustomerInfoService;
import org.springframework.stereotype.Service;

@Service("customerInfoService")
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoDao, CustomerInfoEntity> implements CustomerInfoService {



}