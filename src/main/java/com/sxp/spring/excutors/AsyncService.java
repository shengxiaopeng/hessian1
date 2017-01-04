package com.sxp.spring.excutors;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
@Service
public class AsyncService {
    @Async
    public  void  excute0(Integer i){
        System.out.println(i+" ====="+Thread.currentThread().getName());
        try {
            int span = new Random().nextInt(1000);
            Thread.sleep(span);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
