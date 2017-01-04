package com.sxp.spring.initMethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
public class JSRInitTest {

    @PostConstruct
    public  void  initMethod(){
        System.out.println("init in mode of @PostConstruct");
    }

    @PreDestroy
    public  void  destoryMethod(){
        System.out.println("destory in mode of @PreDestory");
    }
}
