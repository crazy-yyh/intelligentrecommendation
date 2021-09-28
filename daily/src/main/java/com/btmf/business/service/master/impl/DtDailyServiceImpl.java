package com.btmf.business.service.master.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.master.DtDailyDao;
import com.btmf.business.entity.master.DtDailyEntity;
import com.btmf.business.service.master.DtDailyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dtDailyService")
public class DtDailyServiceImpl extends ServiceImpl<DtDailyDao, DtDailyEntity> implements DtDailyService {


    @Override
    public List<Integer> jobUidList() {
        return null;
    }
}