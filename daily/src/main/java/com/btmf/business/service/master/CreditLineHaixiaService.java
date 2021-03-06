package com.btmf.business.service.master;


import com.baomidou.mybatisplus.extension.service.IService;
import com.btmf.business.entity.master.CreditLineHaixiaEntity;

import java.util.List;

/**
 * 厦门国际银行预授信额度
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 23:03:00
 */
public interface CreditLineHaixiaService extends IService<CreditLineHaixiaEntity> {
    /**
     * 海峡信E贷 预选数据，未排除黑名单
     * @return
     */
    List<CreditLineHaixiaEntity> expectData();

}

