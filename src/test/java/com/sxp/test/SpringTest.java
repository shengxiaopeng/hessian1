package com.sxp.test;

import com.sxp.spring.profile.ProfileConfig;
import com.sxp.spring.profile.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shengxiaopeng on 2017/1/4.
 *
 *
 * 运行此测试  出现了个问题
 * java.lang.UnsupportedClassVersionError: javax/servlet/ServletContext : Unsupported major.minor version 52.0
 *
 *
         <dependency>
         <groupId>javax.servlet</groupId>
         <artifactId>javax.servlet-api</artifactId>
         <version>3.1.0</version>
         </dependency>

    servlet 版本太高所致  版本从 4.0.0-b01 换成了3.1.0
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProfileConfig.class})
@ActiveProfiles("dev")   //prod
public class SpringTest {

    @Autowired
    TestBean testBean;

    @Test
    public  void test(){

        String name = testBean.getName();
        System.out.println(name+" hello");
    }

}
