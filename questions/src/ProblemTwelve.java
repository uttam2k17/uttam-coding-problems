package com.daily;

import java.util.Arrays;
import java.util.List;

public class ProblemTwelve {
    public static void main(String[] args) {
        //Find a sum of first 2 numbers in a list
        List<Integer> l1 = Arrays.asList(1,4,2,5,7);
        Integer l = l1.stream().limit(2)
                .reduce(0, (a,b)->a+b);
        System.out.println(l);
        int sum = l1.stream().limit(2).mapToInt(Integer::intValue).sum();
        //mapToInt = Stream<Integer>  →  IntStream
        System.out.println(sum);
    }
}
