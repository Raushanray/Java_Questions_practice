package java_8_functions_questions.commonQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheGivenList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "grapes", "apple", "orange");
        words.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
