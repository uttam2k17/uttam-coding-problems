package com.daily;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProblemEleven {
    //Add a "[" as prefix ,"]" as suffix and "," delimiter for each word in String Array
    public static void main(String[] args) {
        String word = "hello hi how are you";
        String s = Arrays.stream(word.split("\\s+"))
                .map(w -> "["+w+"]").collect(Collectors.joining(","));
        System.out.println(s);
    }
}
