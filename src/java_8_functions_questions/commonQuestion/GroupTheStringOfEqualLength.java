package java_8_functions_questions.commonQuestion;
/*
Group by String of equal length from List using java 8.
input: "apple","orange", "grapes", "banana", "mango", "pineapple", "plume"
output: {5=[apple, mango, plume], 6=[orange, grapes, banana], 9=[pineapple]}
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTheStringOfEqualLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "grapes", "banana", "mango", "pineapple", "plume");
        Map<Integer, List<String>> collect = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Group The String Of Equal Length: " + collect);

    }
}
