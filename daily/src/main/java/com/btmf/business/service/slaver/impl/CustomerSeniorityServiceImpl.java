package com.btmf.business.service.slaver.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.slaver.CustomerSeniorityDao;
import com.btmf.business.entity.slaver.CustomerSeniorityEntity;
import com.btmf.business.service.slaver.CustomerSeniorityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerSeniorityService")
public class CustomerSeniorityServiceImpl extends ServiceImpl<CustomerSeniorityDao, CustomerSeniorityEntity> implements CustomerSeniorityService {

    /**
     * 信E贷黑名单 2
     * @return
     */
    @Override
    public List<Integer> exceptData() {
        return baseMapper.exceptData();
    }
}