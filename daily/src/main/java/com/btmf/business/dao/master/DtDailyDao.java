package com.btmf.business.dao.master;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.master.DtDailyEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 智能推荐日报
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-24 21:45:04
 */
@Mapper
public interface DtDailyDao extends BaseMapper<DtDailyEntity> {

    List<Integer> queryQualificationsNum(@Param("prov") String prov,
                                         @Param("city") String city,
                                         @Param("area") String area);
}
