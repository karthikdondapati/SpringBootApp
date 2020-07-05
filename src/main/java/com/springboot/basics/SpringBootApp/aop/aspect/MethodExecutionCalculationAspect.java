package com.springboot.basics.SpringBootApp.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Example used to check user Access and allow execution

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private static Logger logger = LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

    @Around("com.springboot.basics.SpringBootApp.aop.aspect.CommonJointPointConfig.BusinessExecutionLayer()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time Taken For Execution :" + timeTaken);
    }
}
