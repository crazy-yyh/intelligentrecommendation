package com.btmf.business.service.master.impl;

import com.btmf.business.entity.master.CreditLineHaixiaEntity;
import com.btmf.business.service.master.BusinessService;
import com.btmf.business.service.master.CreditLineHaixiaService;
import com.btmf.business.service.slaver.CustomerInfoService;
import com.btmf.business.service.slaver.CustomerSeniorityService;
import com.btmf.business.service.slaver.OrderFollowService;
import com.btmf.business.service.slaver.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service("BusinessService")
public class BusinessServerImpl implements BusinessService {

    @Autowired
    private CustomerInfoService customerInfoService;

    @Autowired
    private CustomerSeniorityService customerSeniorityService;

    @Autowired
    private OrderFollowService orderFollowService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private CreditLineHaixiaService creditLineHaixiaService;

    /**
     * 查询信E贷剩余量
     * @return
     */
    @Override
    public Integer queryNum() {

        List<Integer> black = blackList();

        List<CreditLineHaixiaEntity> entities = creditLineHaixiaService.expectData();
        System.out.println("==================================================有资质的 有：" + entities.size());

        int it = 0;
        for(Iterator<CreditLineHaixiaEntity> entityIterator = entities.iterator(); entityIterator.hasNext();){
            CreditLineHaixiaEntity next = entityIterator.next();
            for (int i = 0; i < black.size(); i++) {
                if(next.getCustId() == black.get(i)){
                    it+= 1;
                }
            }
        }

        System.out.println("it"+ it);
//        entities.removeIf(e -> {
//            black.contains(e.getCustId())
//        });

        return entities.size();
    }

    private List<Integer> blackList(){
        List<Integer> listA = customerInfoService.exceptStatusData();
        System.out.println("==================================================黑名单1 有：" + listA.size());
        List<Integer> listB = customerSeniorityService.exceptData();
        System.out.println("==================================================黑名单2 有：" + listB.size());
        List<Integer> listC = orderFollowService.exceptData();
        System.out.println("==================================================黑名单3 有：" + listC.size());
        List<Integer> listD = ordersService.exceptData();
        System.out.println("==================================================黑名单4 有：" + listD.size());

        List<Integer> listF = customerInfoService.exceptStatusData();
        System.out.println("==================================================黑名单5 有：" + listF.size());

        List<Integer> listE = Stream.of(listA, listB,listC,listD,listF)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("==================================================去重黑名单 有：" + listE.size());

        return  listE;

    }



}
