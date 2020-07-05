package com.springboot.basics.SpringBootApp;

import com.springboot.basics.ComponentScan.ComponentDao;
import com.springboot.basics.SpringBootApp.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.springboot.basics.ComponentScan")
public class SpringBootAppCDIApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBootAppCDIApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBootAppCDIApplication.class, args);
		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
		logger.info("" +someCDIBusiness.getSomeCDIDao());

	}

}
