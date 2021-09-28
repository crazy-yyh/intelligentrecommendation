package com.btmf.business.service.slaver;


import com.baomidou.mybatisplus.extension.service.IService;
import com.btmf.business.entity.slaver.OrderFollowEntity;

import java.util.List;

/**
 * 订单跟进信息
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
public interface OrderFollowService extends IService<OrderFollowEntity> {

    /**
     * 信E贷黑名单 3
     * @return
     */
    List<Integer> exceptData();

}

