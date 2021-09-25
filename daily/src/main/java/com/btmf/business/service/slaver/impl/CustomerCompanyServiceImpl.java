package com.btmf.business.service.slaver.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.CustomerCompanyDao;
import com.btmf.business.entity.slaver.CustomerCompanyEntity;
import com.btmf.business.service.slaver.CustomerCompanyService;
import org.springframework.stereotype.Service;

@Service("customerCompanyService")
public class CustomerCompanyServiceImpl extends ServiceImpl<CustomerCompanyDao, CustomerCompanyEntity> implements CustomerCompanyService {



}