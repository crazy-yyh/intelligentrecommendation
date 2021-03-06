package com.btmf.business.dao.master;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.master.DtDayCustIdEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 当天可推荐客户
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-24 21:45:05
 */
@Mapper
public interface DtDayCustIdDao extends BaseMapper<DtDayCustIdEntity> {

    //查询所有符合条件的，但还未过滤，初始数据
    List<Integer> preQuerySeniority(@Param("qualificationScore") String qualificationScore,
                              @Param("city") String city);
}
