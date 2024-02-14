package java_8_functions_questions.commonQuestion;

import java.util.Arrays;
import java.util.List;

public class FindSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 5, 7, 8);
        System.out.println("Square the given numbers = " + numbers.stream().mapToInt(n -> n * n).sum());
        int sum = numbers.stream().mapToInt(n -> n * n).sum();
        System.out.println("sum of the given :" + sum);
    }
}
