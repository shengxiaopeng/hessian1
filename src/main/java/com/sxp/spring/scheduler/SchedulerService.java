package com.sxp.spring.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
@Service
public class SchedulerService {

    @Scheduled(fixedRate = 2000)
    public void fixedTimeTask(){
        System.out.println("fixed rate "+new Date());

    }

    @Scheduled(cron="0 30 11 * * ?")
    public  void  cronTask(){
        System.out.println("cron task");
    }

}