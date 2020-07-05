package com.springboot.basics.SpringBootApp.basic;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm algorithm ;

    public int binarySearch(int[] nums,int numberToSearch){

        BubbleSort alg = new BubbleSort();
        int[] sortedNums = algorithm.sortNumbers(nums);
        System.out.println(algorithm);
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("PreDestroy");
    }
}
