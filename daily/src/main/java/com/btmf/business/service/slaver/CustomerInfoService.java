package com.btmf.business.service.slaver;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.btmf.business.entity.master.UpKafkaEntity;
import com.btmf.business.entity.slaver.CustomerInfoEntity;

import java.util.List;

/**
 * 客户信息表
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
public interface CustomerInfoService extends IService<CustomerInfoEntity> {
    /**
     * 信E贷黑名单 1
     * @return
     */
    List<Integer> exceptStatusData();

    List<Integer> exceptBlackData();

    List<Integer>  queryPinAnProduct(JSONObject jsonObject);

    Boolean  distribute_PinAn_Data(JSONObject jsonObject);
}

