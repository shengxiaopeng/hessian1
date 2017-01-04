package com.sxp.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */

@Configuration
@ComponentScan("com.sxp.spring.event")
public class EventConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);

        publisher.publish();

        //直接发布
        context.publishEvent(new DemoEvent(new Object(),"hello spring event2222"));

       // new   ThreadPoolExecutor()
    }

}
