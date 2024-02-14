package java_8_functions_questions.commonQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 5, 7, 8, 9, 12, 36);
        numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
