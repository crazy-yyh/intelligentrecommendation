package com.btmf.business.dao.slaver;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.slaver.CustomerSeniorityEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 客户资质信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-28 14:29:48
 */
@Mapper
public interface CustomerSeniorityDao extends BaseMapper<CustomerSeniorityEntity> {

    List<Integer> exceptData();
}
