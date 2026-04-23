package com.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemOne {
    public static void main(String[] args) {
        List<Integer> listDivisiblebyFive = Arrays.asList(1,2,4,5,10,6,9,12);
        int[] arr = new int[]{1,2,4,5,6,3};
        List<Integer> l1 = listDivisiblebyFive.stream().filter(x -> x % 5 == 0)
                .collect(Collectors.toList());
        Arrays.stream(arr).boxed().filter(x -> x % 3 == 0)
                .forEach(System.out::println);
        System.out.println(l1);
        l1.stream().forEach(System.out::println);
    }
}
