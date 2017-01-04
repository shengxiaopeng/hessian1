package com.sxp.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void  publish(){
        applicationContext.publishEvent(new DemoEvent(this,"hello spring event"));
    }




}
