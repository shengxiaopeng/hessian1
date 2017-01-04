package com.sxp.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public  TestBean devBean(){
        TestBean testBean = new TestBean();
        testBean.setName("dev profile");

        return testBean;
    }

    @Bean
    @Profile("prod")
    public  TestBean prodBean(){
        TestBean testBean = new TestBean();
        testBean.setName("prod profile");

        return testBean;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        TestBean bean = context.getBean(TestBean.class);
        System.out.println(bean.getName());;

        context.close();
    }


}
