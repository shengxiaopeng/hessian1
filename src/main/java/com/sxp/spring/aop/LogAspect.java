package com.sxp.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * ${DESCRIPTION}
 *
 * @author sxp
 * @create 2016/12/22.
 */

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.sxp.spring.aop.Action)")
    public  void annotationPointCut(){

    }

    /**
     * 注解式的切面
     * @param joinPoint
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();

        Method method = signature.getMethod();
        System.out.println(method.getName()+":"+method.getAnnotation(Action.class).name());
        System.out.println(method.getAnnotation(Action.class).annotationType()+" "+method.getAnnotation(Action.class).getClass());
        //AopUtils.getTargetClass(Action.class)
    }

    @Before("execution(* com.sxp.spring.aop.UseBean.*(..))")
    public void before(JoinPoint joinPoint){

        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println(method.getName()+"这是方法级别的注解！");
    }




}
