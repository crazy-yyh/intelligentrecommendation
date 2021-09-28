package com.btmf.business.service.master;


import com.baomidou.mybatisplus.extension.service.IService;
import com.btmf.business.entity.master.DistrictEntity;

import java.util.List;

/**
 * 
 *
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-28 11:23:53
 */
public interface DistrictService extends IService<DistrictEntity> {

    //省市区树形图
    List<DistrictEntity> withTree();

}

