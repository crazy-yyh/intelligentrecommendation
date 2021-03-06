package com.btmf.business.service.master.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.master.CreditLineHaixiaDao;
import com.btmf.business.entity.master.CreditLineHaixiaEntity;
import com.btmf.business.service.master.CreditLineHaixiaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("creditLineHaixiaService")
public class CreditLineHaixiaServiceImpl extends ServiceImpl<CreditLineHaixiaDao, CreditLineHaixiaEntity> implements CreditLineHaixiaService {

    /**
     * 海峡信E贷 预选数据，未排除黑名单
     * @return
     */
    @Override
    public List<CreditLineHaixiaEntity> expectData() {
        return baseMapper.expectData();
    }
}