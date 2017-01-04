package com.sxp.spring.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(OSConditon.class)
    TestBean testBean(){
        TestBean testBean = new TestBean();
        testBean.setName("hello conditon");
        return testBean;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
        //如果没有相应的bean   会直接报异常
        TestBean bean = context.getBean(TestBean.class);

        System.out.println(bean==null?"not windows":"windows");
    }

}
