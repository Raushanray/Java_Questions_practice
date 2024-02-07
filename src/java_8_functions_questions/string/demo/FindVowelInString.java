package java_8_functions_questions.string.demo;
//Write a code to find the vowels in the given string with using java8 feature.

import java.util.List;
import java.util.stream.Collectors;

public class FindVowelInString {
    public static void main(String[] args) {
        String input = "I love Bengaluru city";
        String toLowerCase = input.toLowerCase();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        long vowelsCounts = toLowerCase.chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
        List<Character> collect = toLowerCase.chars().mapToObj(c -> (char) c).filter(vowels::contains).collect(Collectors.toList());
        System.out.println("Original input :" + input);
        System.out.println("Number of vowels in the given strings: " + vowelsCounts + ", Show the vowels: " + collect);
//        System.out.println("Number of vowels in the given strings: " + collect);
    }
}
