package com.springboot.basics.SpringBootApp;

import com.springboot.basics.SpringBootApp.basic.BinarySearch;
import com.springboot.basics.SpringBootApp.cdi.SomeCDIBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBootAppBasicApplication {


	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBootAppBasicApplication.class, args);

	}

}
