package com.daily;

import java.util.Arrays;
import java.util.Comparator;

public class ProblemFourteen {
    public static void main(String[] args) {
        //SecondLargest Number in array
        int arr[] = new int[]{1,4,1,12,11,45,2};
        Arrays.stream(arr).sorted().skip(arr.length-2)
                .findFirst().ifPresentOrElse(System.out::println, () ->
                { System.out.println("not found");});
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .ifPresent(System.out::println);
    }
}
