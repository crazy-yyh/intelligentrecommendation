package com.btmf.business.service.slaver.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.CustomerOccupyDao;
import com.btmf.business.entity.slaver.CustomerOccupyEntity;
import com.btmf.business.service.slaver.CustomerOccupyService;
import org.springframework.stereotype.Service;

@Service("customerOccupyService")
public class CustomerOccupyServiceImpl extends ServiceImpl<CustomerOccupyDao, CustomerOccupyEntity> implements CustomerOccupyService {



}