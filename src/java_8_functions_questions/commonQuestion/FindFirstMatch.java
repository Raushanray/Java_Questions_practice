package java_8_functions_questions.commonQuestion;
/*
Find the first element starting with character b
input list: ["apple", "banana", "grapes", "blueberry"]
output: First match: banana
 */

import java.util.Arrays;
import java.util.List;

public class FindFirstMatch {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grapes", "blueberry");
        String result = list.stream().filter(l -> l.startsWith("b")).findFirst().get();
        System.out.println("First match: " + result);
    }
}
