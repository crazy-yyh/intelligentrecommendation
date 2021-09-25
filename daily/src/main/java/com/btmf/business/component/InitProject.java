package com.btmf.business.component;

import com.btmf.business.service.master.DtDayCustIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Calendar;

@Component
public class InitProject implements ApplicationRunner {
 
 
    @Autowired
    private DtDayCustIdService dtDayCustIdService;
 
    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("===================做自己最害怕的事，会使你进步更大！======================");

        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改

        int hour = 0;
        int minute = 0;
//        int second

        System.out.println(hour);

//        while(hour<21 && minute < 46){
//             hour = c.get(Calendar.HOUR_OF_DAY);
//             minute = c.get(Calendar.MINUTE);
////            int second = c.get(Calendar.SECOND);
//
//            dtDayCustIdService.pri();
//        }


 

    }
}