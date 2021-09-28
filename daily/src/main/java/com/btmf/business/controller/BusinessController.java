package com.btmf.business.controller;


import com.btmf.business.entity.master.DistrictEntity;
import com.btmf.business.service.master.DistrictService;
import com.btmf.business.service.master.DtDayCustIdService;
import com.btmf.business.service.slaver.OrdersService;
import com.btmf.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private DistrictService districtService;

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


    /**
     * 安妮的需求，上传信E贷
     */
    @GetMapping(value = "/test2")
    public Result up_xyd() {

        //        List<Long> longs = dtDayCustIdService.queryDtSeniority(" and final_level>3", " and prov in ('福建省','浙江省')");
        List<Integer> longs1 = ordersService.NoQualifications(3);
        //        List<Long> longs2 = dtDayCustIdService.queryDtSeniority(" and final_level=2", " and prov in ('福建省','浙江省')");
        //        List<Long> longs3 = dtDayCustIdService.queryDtSeniority(" and final_level=1", " and prov in ('福建省','浙江省')");
        //        List<Long> longs4 = dtDayCustIdService.queryDtSeniority(" and final_level=0", " and prov in ('福建省','浙江省')");

        return Result.ok().data("len",longs1.size());
    }

    /**
     * 方丽敏的需求，改城市
     */
    @PostMapping("/changeCity")
    public Result changeCity(@RequestBody DistrictEntity districtEntity) {

        boolean flag = districtService.updateById(districtEntity);

        if(flag){
            return Result.ok().message("修改成功");
        }else{
            return Result.error().message("发生错误，请联系数据部");
        }
    }
}
