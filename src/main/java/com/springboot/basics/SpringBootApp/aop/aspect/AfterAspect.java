package com.springboot.basics.SpringBootApp.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Example used to check user Access and allow execution

@Aspect
@Configuration
public class AfterAspect {

    private static Logger logger = LoggerFactory.getLogger(AfterAspect.class);

    
    @AfterReturning(
            value="com.springboot.basics.SpringBootApp.aop.aspect.CommonJointPointConfig.BusinessExecutionLayer()",
            returning="result"
    )
    public void afterReturning(JoinPoint joinpoint,Object result) {
        logger.info("{} Returned With Value {} " + joinpoint, result);
    }

    @AfterThrowing(
            value="com.springboot.basics.SpringBootApp.aop.aspect.CommonJointPointConfig.BusinessExecutionLayer()",
            throwing="exception"
    )
    public void afterThrowing(JoinPoint joinpoint,Exception exception) {
        logger.info("{} Returned With Value {} " + joinpoint, exception);
    }

}
