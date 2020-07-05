package com.springboot.basics.SpringBootApp.aop.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {

    @Pointcut("execution(* com.springboot.basics.SpringBootApp.aop.data.*(..))")
    public void dataExecutionLayer(){

    }

    @Pointcut("execution(* com.springboot.basics.SpringBootApp.aop.business.*(..))")
    public void BusinessExecutionLayer(){

    }

    @Pointcut("com.springboot.basics.SpringBootApp.aop.aspect.CommonJointPointConfig.dataExecutionLayer() && com.springboot.basics.SpringBootApp.aop.aspect.CommonJointPointConfig.BusinessExecutionLayer()")
    public void AllExecutionLayer(){

    }

    @Pointcut("@annotation(com.springboot.basics.SpringBootApp.aop.aspect.TrackTime)")
    public void trackTimeAnnotation(){

    }
}
