package com.springboot.basics.SpringBootApp;

import com.springboot.basics.ComponentScan.ComponentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.basics.ComponentScan")
public class SpringBootAppComponentScanApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBootAppComponentScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBootAppComponentScanApplication.class, args);

		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);

/*		ComponentDao personDao2 = applicationContext.getBean(ComponentDao.class);

		logger.info("{}" + personDao1);
		logger.info("{}" + personDao1.getJdbConnection());

		logger.info("{}" + personDao2);
		logger.info("{}" + personDao2.getJdbConnection());*/

	}

}
