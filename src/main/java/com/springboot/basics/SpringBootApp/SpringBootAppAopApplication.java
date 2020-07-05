package com.springboot.basics.SpringBootApp;

import com.springboot.basics.SpringBootApp.aop.business.Business1;
import com.springboot.basics.SpringBootApp.aop.business.Business2;
import com.springboot.basics.SpringBootApp.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppAopApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(SpringBootAppAopApplication.class);

	@Autowired
	Business1 business1;
	Business2 business2;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootAppAopApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}

}
