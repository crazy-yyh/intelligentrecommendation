package com.btmf.business.service.slaver;


import com.baomidou.mybatisplus.extension.service.IService;
import com.btmf.business.entity.slaver.CustomerSeniorityEntity;

import java.util.List;

/**
 * 客户资质信息
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-28 14:29:48
 */
public interface CustomerSeniorityService extends IService<CustomerSeniorityEntity> {
    /**
     * 信E贷黑名单 2
     * @return
     */
    List<Integer> exceptData();

}

