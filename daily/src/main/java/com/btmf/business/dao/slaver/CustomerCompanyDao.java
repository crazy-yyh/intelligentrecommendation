package com.btmf.business.dao.slaver;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.slaver.CustomerCompanyEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 客户公司信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Mapper
public interface CustomerCompanyDao extends BaseMapper<CustomerCompanyEntity> {
	
}
