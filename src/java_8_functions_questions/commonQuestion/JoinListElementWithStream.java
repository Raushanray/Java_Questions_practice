package java_8_functions_questions.commonQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListElementWithStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "grapes", "banana", "mango", "pineapple", "plume");
        String collect = strings.stream().collect(Collectors.joining(", "));
        System.out.println("Joined String: " + collect);
    }
}
