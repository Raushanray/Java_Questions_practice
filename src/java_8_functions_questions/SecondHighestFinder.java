package java_8_functions_questions;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondHighestFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 6, 8, 12, 18};
        OptionalInt secondHighestNumber = findSecondHighestNumber(numbers);
        if (secondHighestNumber.isPresent()) {
            System.out.println("Second highest element: " + secondHighestNumber);
        } else {
            System.out.println("There is no second highest element in the array.");
        }
    }

    private static OptionalInt findSecondHighestNumber(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements.");
        }
        return Arrays.stream(numbers).boxed()
                .sorted((a, b) -> Integer.compare(b, a))
                .mapToInt(Integer::intValue).skip(1).findFirst();
    }


}
