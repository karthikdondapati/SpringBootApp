package com.springboot.basics.SpringBootApp;

import com.springboot.basics.SpringBootApp.basic.BinarySearch;
import com.springboot.basics.SpringBootApp.scope.PersonDao;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBootAppScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBootAppScopeApplication.class, args);

		PersonDao personDao1 = applicationContext.getBean(PersonDao.class);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

		logger.info("{}" + personDao1);
		logger.info("{}" + personDao1.getJdbConnection());

		logger.info("{}" + personDao2);
		logger.info("{}" + personDao2.getJdbConnection());

	}

}
