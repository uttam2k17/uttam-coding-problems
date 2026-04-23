package com.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ProblemSix {
    //Prime no
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(3,2,1,4,6,5,13);
        List<Integer> l2 = l1.stream().filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(d -> n % d == 0)).toList();
        System.out.println(l2);
    }

//    private static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        if (n == 2) return true;
//        if (n % 2 == 0) return false;
//
//        int limit = (int) Math.sqrt(n);
//        for (int d = 3; d <= limit; d += 2) {
//            if (n % d == 0) return false;
//        }
//        return true;
//    }

}
