package java_8_functions_questions.commonQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleEachElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 6, 5, 4, 8, 9);
        List<Integer> collect = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("Double Each Given Element: " + collect);
    }
}
