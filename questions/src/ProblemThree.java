package com.daily;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemThree {
    // remove duplicates and preserve order
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,1,4,2,7,4,5,6,5,6);
        LinkedHashSet<Integer> l2 = new LinkedHashSet<>();
        l1.stream().map(x-> l2.add(x))
                .collect(Collectors.toList());
        l1.stream().collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println(l2);
        System.out.println(l1);
    }
}
