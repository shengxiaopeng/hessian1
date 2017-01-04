package com.sxp.spring.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
@Configuration
@EnableScheduling
@ComponentScan("com.sxp.spring.scheduler")
public class ScheduleConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScheduleConfig.class);

    }

}
