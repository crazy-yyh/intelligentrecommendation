package com.btmf.business.dao.slaver;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.slaver.CustomerInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户信息表
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Mapper
public interface CustomerInfoDao extends BaseMapper<CustomerInfoEntity> {

    List<Integer> exceptStatusData();

    List<Integer> exceptBlackData();

    List<Integer> queryPinAnProductNum(@Param("prov") String prov,
                                 @Param("city") String city,
                                 @Param("area") String area);
}
