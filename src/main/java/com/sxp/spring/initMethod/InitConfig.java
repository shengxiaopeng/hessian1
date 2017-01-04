package com.sxp.spring.initMethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */

@Configuration
public class InitConfig {

    @Bean
    public JSRInitTest jsrInitTest(){
        return new JSRInitTest();
    }

    @Bean(initMethod = "initMethod",destroyMethod = "destoryMethod")
    public BeanWayInitTest beanWayInitTest(){
        return new BeanWayInitTest();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(InitConfig.class);
        context.getBean(JSRInitTest.class);
        context.getBean(BeanWayInitTest.class);

        context.close();
    }


}
