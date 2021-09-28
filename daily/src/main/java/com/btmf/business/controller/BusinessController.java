package com.btmf.business.controller;


import com.btmf.business.service.master.DtDayCustIdService;
import com.btmf.business.service.slaver.OrdersService;
import com.btmf.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yyh
 * @create 2021-09-25 18:54
 */
@RestController
@RequestMapping("/dailyTask")
public class BusinessController {

    @Autowired
    private DtDayCustIdService dtDayCustIdService;

    @Autowired
    private OrdersService ordersService;

    @GetMapping(value = "/test")
    public Result result1() {

        List<Integer> longs = dtDayCustIdService.queryDtSeniority(1," and final_level>3", " and prov in ('福建省','浙江省')");
//        List<Long> longs1 = dtDayCustIdService.queryDtSeniority(" and final_level=3", " and prov in ('福建省','浙江省')");
//        List<Long> longs2 = dtDayCustIdService.queryDtSeniority(" and final_level=2", " and prov in ('福建省','浙江省')");
//        List<Long> longs3 = dtDayCustIdService.queryDtSeniority(" and final_level=1", " and prov in ('福建省','浙江省')");
//        List<Long> longs4 = dtDayCustIdService.queryDtSeniority(" and final_level=0", " and prov in ('福建省','浙江省')");

        return Result.ok().data("len",longs.size());
    }

    @GetMapping(value = "/test2")
    public Result result2() {

        //        List<Long> longs = dtDayCustIdService.queryDtSeniority(" and final_level>3", " and prov in ('福建省','浙江省')");
        List<Integer> longs1 = ordersService.NoQualifications(3);
        //        List<Long> longs2 = dtDayCustIdService.queryDtSeniority(" and final_level=2", " and prov in ('福建省','浙江省')");
        //        List<Long> longs3 = dtDayCustIdService.queryDtSeniority(" and final_level=1", " and prov in ('福建省','浙江省')");
        //        List<Long> longs4 = dtDayCustIdService.queryDtSeniority(" and final_level=0", " and prov in ('福建省','浙江省')");

        return Result.ok().data("len",longs1.size());
    }
}
