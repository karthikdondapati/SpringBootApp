package com.springboot.basics.SpringBootApp.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {
    
    public int[] sortNumbers(int[] numbers){
        return numbers;
    }
}
