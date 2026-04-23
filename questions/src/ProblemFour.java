package com.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProblemFour {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,2,6,21,11,12);
        l1.stream().filter(x -> x.toString().startsWith("1"))
                .forEach(System.out::println);

        //Join Stream
        List<Integer> l2 = Arrays.asList(1,4,1,99,44);
        Stream<Integer> l3 = Stream.concat(l1.stream().map(x -> x*2),l2.stream().map(y -> y*2));
        l3.forEach(System.out::println);
        //System.out.println(l3.collect(Collectors.toList()));
    }
}
