package com.springboot.basics.SpringBootApp.aop.data;

import com.springboot.basics.SpringBootApp.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething() {
        return "Dao1";
    }
}
