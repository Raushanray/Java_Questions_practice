package java_8_functions_questions.commonQuestion;

import java.util.Arrays;
import java.util.List;

/*
check if all element in the list satisfy a condition (if all are even numbers)
input list: [1,2,3,4,5]
output: All numbers are not even numbers
 */
public class CheckIfAllElementSatisfyACondition {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 30, 4, 50);
        boolean result = numbers.stream().allMatch(n -> n % 2 == 0);
        if (result) {
            System.out.println("All the numbers are even number");
        } else {
            System.out.println("All the numbers are not  even number");
        }
    }
}
