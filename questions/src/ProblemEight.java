package com.daily;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProblemEight {
    public static void main(String[] args) {
        //Given string is palindrome or not
        String p = "madam";
        String q = "";
        for(int i=p.length()-1; i>=0; i--) {
            q += p.charAt(i);
        }
        if (p.equals(q)) {
            System.out.println("palindrome");
        }
//overkill for single word and redundant joining.
        System.out.println(Stream.of(p).map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining()));
        String reversed =
                Stream.of(p)
                        .map(x -> new StringBuilder(x).reverse().toString())
                        .findFirst()
                        .orElse("");

        //2nd best
        boolean isPalindrome =
                IntStream.range(0, p.length() / 2)
                        .allMatch(i -> p.charAt(i) == p.charAt(p.length() - 1 - i));
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");

        String reversed1 =
                p.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .reduce("", (a, b) -> b + a); // prepend (reverse)

        System.out.println(p.equals(reversed1) ? "Palindrome" : "Not Palindrome");
    }
//best
    public static boolean isPalindrome(String s) {
        if (s == null) return false;   // or true, based on your requirement
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;          // early exit on mismatch
            }
            i++;
            j--;
        }
        return true;
    }
    //2nd best
    public static boolean isPalindromeStream(String s) {
        if (s == null) return false;
        int n = s.length();

        return IntStream.range(0, n / 2)
                .allMatch(i -> s.charAt(i) == s.charAt(n - 1 - i));
    }


}
