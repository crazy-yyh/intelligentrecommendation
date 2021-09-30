package com.btmf.business.service.master;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.btmf.business.entity.master.DtDailyEntity;

import java.util.List;

/**
 * 智能推荐日报
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-24 21:45:04
 */
public interface DtDailyService extends IService<DtDailyEntity> {

    List<Integer> jobUidList();

    List<Integer> queryQualificationsNum(JSONObject jsonObject);

    Boolean distribute_Qualifications_Data(JSONObject jsonObject);
}

