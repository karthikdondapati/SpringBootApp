package com.springboot.basics.SpringBootApp.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSort implements SortAlgorithm {

    public int[] sortNumbers(int[] numbers){
        return numbers;
    }
}
