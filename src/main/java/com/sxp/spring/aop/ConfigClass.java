package com.sxp.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ${DESCRIPTION}
 * 相当于applicationContext.xml的作用
 * @author sxp
 * @create 2016/12/22.
 */

@Configuration
@ComponentScan("com.sxp.spring.aop")
@EnableAspectJAutoProxy
public class ConfigClass {

}
