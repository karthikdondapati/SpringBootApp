package com.springboot.basics.SpringBootApp.aop.aspect;

import com.springboot.basics.SpringBootApp.SpringBootAppScopeApplication;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Example used to check user Access and allow execution

@Aspect
@Configuration
public class BeforeAspect {

    private static Logger logger = LoggerFactory.getLogger(BeforeAspect.class);


    @Before("com.springboot.basics.SpringBootApp.aop.aspect.CommonJointPointConfig.BusinessExecutionLayer()")
    public void before(JoinPoint joinpoint) {
        logger.info("Intercepted Method Calls {}" + joinpoint);
    }

}
