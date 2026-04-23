package com.daily;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ProblemNine {
    //find nth smallest element in a array
    public static void main(String[] args) {
        List<Integer> l1 = List.of(5,1,4,2,0,3);
        l1.stream().sorted().skip(1-1).findFirst().ifPresent(System.out::println);
        int l2[] = new int[]{5,1,4,2,0,3};
        Arrays.stream(l2).boxed().sorted().findFirst()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("no element found") );
        Arrays.stream(l2).min()
                .ifPresentOrElse(System.out::println,
                        () -> { throw new NoSuchElementException("Empty Array"); });

    }
}
