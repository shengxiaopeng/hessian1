package com.sxp.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author sxp
 * @create 2016/12/22.
 */

@Service
public class UseBean {

    @Autowired
    Bean1 bean1;

    @Action(name="it is annotation")
    public String getBean1(){
        //bean1.setName("hello");
        System.out.println(bean1.getName());
        return bean1.getName();
    }


}
