package java_8_functions_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumbersFinderJ_8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 8, 6, 7, 10};

        List<Integer> missingNumbers = findMissingNumbers(numbers);
        System.out.println("Missing Numbers : " + missingNumbers);
    }

    private static List<Integer> findMissingNumbers(int[] numbers) {
        Arrays.sort(numbers);
        List<Integer> missingNumbers = new ArrayList<>();

        int expectedNumber = 1;
        for (int num : numbers) {
            while (expectedNumber < num) {
                missingNumbers.add(expectedNumber);
                expectedNumber++;
            }
            expectedNumber = num + 1;
        }

        int maxNumber = numbers[numbers.length - 1];
        missingNumbers.addAll(IntStream.range(maxNumber + 1, expectedNumber).boxed().toList());
        return missingNumbers;
    }
}
