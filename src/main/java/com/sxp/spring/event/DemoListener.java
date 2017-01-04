package com.sxp.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event) {
        System.out.println("listener get msg "+event.getMsg());

    }
}
