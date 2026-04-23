package com.daily;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProblemTwo {
    public static void main(String[] args) {
        //reverse each word in a string
        String words = "hello i am on my way";
//        StringBuilder str = new StringBuilder(words);
//        System.out.println(str.reverse());
//        One space guaranteed → split(" ")
//        Unknown / messy whitespace → split("\\s+")
//        Must preserve whitespace → regex tokenization (\\S+|\\s+)
        System.out.println(Arrays.stream(words.split(" "))
                .map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining(" ")));
       String R1 = Arrays.stream(words.split("\\s+"))
                .map(x -> x.chars()
                        .mapToObj(c -> String.valueOf((char)c))
                        .reduce("",(a,b) -> b+a))
                .collect(Collectors.joining(" "));
        System.out.println(R1);


        String result = Arrays.stream(words.split(" "))
                .map(w -> IntStream.range(0, w.length())
                        .mapToObj(i -> String.valueOf(w.charAt(w.length() - 1 - i)))
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}
