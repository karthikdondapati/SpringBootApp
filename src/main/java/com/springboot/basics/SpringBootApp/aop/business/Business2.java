package com.springboot.basics.SpringBootApp.aop.business;

import com.springboot.basics.SpringBootApp.aop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    public Dao2 dao2;

    public String calculateSomething() {
        return dao2.retrieveSomething();
    }
}
