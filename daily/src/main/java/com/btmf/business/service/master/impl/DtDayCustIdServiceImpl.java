package com.btmf.business.service.master.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.master.DtDayCustIdDao;
import com.btmf.business.entity.master.DtDayCustIdEntity;
import com.btmf.business.service.master.DtDayCustIdService;
import com.btmf.business.service.slaver.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("dtDayCustIdService")
public class DtDayCustIdServiceImpl extends ServiceImpl<DtDayCustIdDao, DtDayCustIdEntity> implements DtDayCustIdService {

    @Autowired
    private OrdersService ordersService;

    private Set<Integer> set = new HashSet<>();




    @Override
    public void updateDtDayCustId() {
        queryDtSeniority(1," and final_level>3", " and prov in ('福建省','浙江省')");
//        queryDtSeniority(5," and final_level=3", " and prov in ('福建省','浙江省')");
    }

    @Override
    public List<Integer> queryDtSeniority(Integer day, String qualificationScore, String city) {

        List<Integer> preData = baseMapper.preQuerySeniority(qualificationScore, city);
        List<Integer> noQualifications = ordersService.NoQualifications(day);


        return preData;

    }

    @Override
    public void pri() {
//        set.add(1);
//        set.add(2);
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}