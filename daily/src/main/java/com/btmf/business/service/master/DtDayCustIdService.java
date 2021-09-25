package com.btmf.business.service.master;


import com.baomidou.mybatisplus.extension.service.IService;
import com.btmf.business.entity.master.DtDayCustIdEntity;

import java.util.List;

/**
 * 当天可推荐客户
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-24 21:45:05
 */
public interface DtDayCustIdService extends IService<DtDayCustIdEntity> {

    //开始更新dt_day_cust_id表
    void updateDtDayCustId();

    //从dt_seniority中过滤
    List<Integer> queryDtSeniority(Integer day, String qualificationScore, String city);

    void pri();
}


