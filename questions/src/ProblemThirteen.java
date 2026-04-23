package com.daily;

import java.util.Arrays;
import java.util.List;

public class ProblemThirteen {
    public static void main(String[] args) {
        //sum of unique numbers in a list
        List<Integer> l1 = Arrays.asList(2,2,4,1,5,4);
        Integer sum = l1.stream().distinct()
                .reduce(0, (a,b) -> a+b);
        System.out.println(sum);
    }
}
