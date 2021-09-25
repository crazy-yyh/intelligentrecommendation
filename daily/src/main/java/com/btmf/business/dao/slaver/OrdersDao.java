package com.btmf.business.dao.slaver;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.slaver.OrdersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 订单主表信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 14:43:06
 */
@Mapper
public interface OrdersDao extends BaseMapper<OrdersEntity> {

    @Transactional(value = "SalverTransactionManager")
    List<Long> queryQualifications(@Param("day") Integer day);
}
