package com.btmf.business.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.btmf.business.entity.master.DistrictEntity;
import com.btmf.business.service.master.BusinessService;
import com.btmf.business.service.master.DistrictService;
import com.btmf.business.service.master.DtDayCustIdService;
import com.btmf.business.service.slaver.CustomerInfoService;
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

    @Autowired
    private BusinessService BusinessService;

    @Autowired
    private CustomerInfoService customerInfoService;


    @GetMapping(value = "/test")
    public Result result1() {

        List<Integer> longs = dtDayCustIdService.queryDtSeniority(1," and final_level>3", " and prov in ('福建省','浙江省')");
//        List<Long> longs1 = dtDayCustIdService.queryDtSeniority(" and final_level=3", " and prov in ('福建省','浙江省')");
//        List<Long> longs2 = dtDayCustIdService.queryDtSeniority(" and final_level=2", " and prov in ('福建省','浙江省')");
//        List<Long> longs3 = dtDayCustIdService.queryDtSeniority(" and final_level=1", " and prov in ('福建省','浙江省')");
//        List<Long> longs4 = dtDayCustIdService.queryDtSeniority(" and final_level=0", " and prov in ('福建省','浙江省')");

        return Result.ok().data("len",longs.size());
    }

    @GetMapping()
    public Result result2() {

        //        List<Long> longs = dtDayCustIdService.queryDtSeniority(" and final_level>3", " and prov in ('福建省','浙江省')");
        List<Integer> longs1 = ordersService.NoQualifications(3);
        //        List<Long> longs2 = dtDayCustIdService.queryDtSeniority(" and final_level=2", " and prov in ('福建省','浙江省')");
        //        List<Long> longs3 = dtDayCustIdService.queryDtSeniority(" and final_level=1", " and prov in ('福建省','浙江省')");
        //        List<Long> longs4 = dtDayCustIdService.queryDtSeniority(" and final_level=0", " and prov in ('福建省','浙江省')");

        return Result.ok().data("len",longs1.size());
    }

    /**
     * 棕苗的需求，查询数量
     */
//    @GetMapping(value = "/test2")
//    public Result queryIndustryNum() {
//
//
//
//        return Result.ok().data("len",longs1.size());
//    }
//
//    /**
//     * 棕苗的需求，保单
//     */
//    @GetMapping(value = "/test2")
//    public Result queryIndustryNum() {
//
//
//
//        return Result.ok().data("len",longs1.size());
//    }

    /**
     * 棕苗的需求，平安产品
     */
    @GetMapping(value = "/queryIndustryNum")
    public Result queryIndustryNum(@RequestBody JSONObject jsonObject) {

        List<Integer>  integer = customerInfoService.queryPinAnProduct(jsonObject);

        return Result.ok().data("数量： ",integer.size());
    }
    /**
     * 存量分配
     */
    @GetMapping(value = "/queryIndustryNum")
    public Result queryIndustryNum(@RequestBody JSONObject jsonObject) {

        List<Integer>  integer = customerInfoService.queryPinAnProduct(jsonObject);

        return Result.ok().data("数量： ",integer.size());
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
     * 安妮的需求，上传信E贷
     */
    @GetMapping("/queryNumXYD")
    public Result query_xyd_num() {

        return Result.ok().data("len",BusinessService.queryNum());
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
