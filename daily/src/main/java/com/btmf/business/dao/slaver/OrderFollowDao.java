package com.btmf.business.dao.slaver;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.slaver.OrderFollowEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 订单跟进信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Mapper
public interface OrderFollowDao extends BaseMapper<OrderFollowEntity> {

    List<Integer> exceptData();
}
