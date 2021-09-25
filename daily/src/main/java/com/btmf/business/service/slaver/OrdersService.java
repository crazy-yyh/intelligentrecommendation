package com.btmf.business.service.slaver;


import com.baomidou.mybatisplus.extension.service.IService;
import com.btmf.business.entity.slaver.OrdersEntity;

import java.util.List;

/**
 * 订单主表信息
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 14:43:06
 */
public interface OrdersService extends IService<OrdersEntity> {

    List<Integer> qualifications(Integer day, String[]... args);



}

