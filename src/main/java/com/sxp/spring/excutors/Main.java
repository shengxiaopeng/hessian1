package com.sxp.spring.excutors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExcutorsConfig.class);
        AsyncService bean = context.getBean(AsyncService.class);

        for(int i=0;i<10;i++){
            bean.excute0(i);
        }
    }

}
