package com.springboot.basics.SpringBootApp;

import com.springboot.basics.ComponentScan.ComponentDao;
import com.springboot.basics.SpringBootApp.properties.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringBootAppPropertiesApplication {


	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBootAppPropertiesApplication.class, args);
		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
		someExternalService.getUrl();

	}

}
