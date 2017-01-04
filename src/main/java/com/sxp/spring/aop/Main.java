package com.sxp.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @author sxp
 * @create 2016/12/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);

        UseBean bean = context.getBean(UseBean.class);
        String bean1 = bean.getBean1();

        //System.out.println(bean1);

       /* AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigClass.class);
        UseBean2 bean = context.getBean(UseBean2.class);
        bean.getBean2();*/

    }
}
