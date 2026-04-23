package com.daily;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProblemFive {
    //Merge two sorted list into one sorted list
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3);
        List<Integer> l2 = List.of(2,5,6);
      List<Integer> l3 = Stream.concat(l1.stream(),l2.stream()).sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(l3);

        List<Integer> l4 = Stream.concat(l1.stream(),l2.stream()).sorted()
                .toList();
        System.out.println(l4);
        Stream.concat(l1.stream(),l2.stream()).sorted()
                .forEach(System.out::println);
    }
}
