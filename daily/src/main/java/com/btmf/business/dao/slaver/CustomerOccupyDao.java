package com.btmf.business.dao.slaver;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.slaver.CustomerOccupyEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 客户占用信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 14:43:06
 */
@Mapper
public interface CustomerOccupyDao extends BaseMapper<CustomerOccupyEntity> {
	
}
