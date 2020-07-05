package com.springboot.basics.SpringBootApp.aop.business;

import com.springboot.basics.SpringBootApp.aop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    public Dao1 dao1;

    public String calculateSomething() {
        return dao1.retrieveSomething();
    }
}
