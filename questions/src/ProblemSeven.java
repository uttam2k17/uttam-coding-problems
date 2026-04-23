package com.daily;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ProblemSeven {
    public static void main(String[] args) {
    //string starts with number
        List<String> l1 = Arrays.asList("1hello", "hi", "22");
        l1.stream().filter(x -> x != null && !x.isEmpty() &&
                Character.isDigit(x.codePointAt(0)))
                .forEach(System.out::println);

        l1.stream()
                .filter(s -> s != null && s.matches("^\\d.*"))
                .forEach(System.out::println);


        Pattern startsWithDigit = Pattern.compile("^\\d");
        l1.stream()
                .filter(s -> s != null && startsWithDigit.matcher(s).find())
                .forEach(System.out::println);


        for (String s : l1) {
            if (s != null && !s.isEmpty() && Character.isDigit(s.charAt(0))) {
                System.out.println(s);
            }
        }

    }
}
