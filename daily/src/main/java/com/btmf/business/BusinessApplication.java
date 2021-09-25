package com.btmf.business;

import com.btmf.business.service.master.DtDayCustIdService;
import com.btmf.business.service.slaver.OrdersService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author yyh
 * @create 2021-09-25 18:48
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.btmf.business.dao,master","com.btmf.business.dao,slaver"})
public class BusinessApplication {


    @Autowired
    private OrdersService ordersService;


    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);

//        System.out.println("=============================项目开始启动==============================");
//
//        DtDayCustIdService bean = run.getBean(DtDayCustIdService.class);
//
//        bean.pri();

    }
}
