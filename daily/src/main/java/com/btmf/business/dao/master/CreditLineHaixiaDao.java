package com.btmf.business.dao.master;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.btmf.business.entity.master.CreditLineHaixiaEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 厦门国际银行预授信额度
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 23:03:00
 */
@Mapper
public interface CreditLineHaixiaDao extends BaseMapper<CreditLineHaixiaEntity> {

    List<CreditLineHaixiaEntity> expectData();
}
