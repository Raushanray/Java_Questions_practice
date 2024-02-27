package java_8_functions_questions.demo;
/*
Write a code to reverse each word of a string using java8 using Stream api.
input: "Hello Java World"
output: Reverse Each Word In String: [olleH, avaJ, dlroW]
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String s1 = "Hello Java World";
        String[] split = s1.split(" ");
        List<String> results = Arrays.stream(split).map((word) -> new StringBuilder(word)
                .reverse().toString()).collect(Collectors.toList());
        System.out.println("Reverse Each Word In String: " + results);
    }
}
