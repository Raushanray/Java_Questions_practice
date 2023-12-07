package java_8_functions_questions.arrays.code;
/*
 * Q>. Give an array of integers, write a java 8 program to find the second smallest element.
 * input : int[] numbers = {5,2,8,3,1,1};
 */

import java.util.Arrays;

public class SecondSmallestNumber {
    public static void fetchSecondSmallestNum(int[] arr) {
        int secondSmallestNumber = Arrays.stream(arr).distinct().sorted().skip(1)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Array does not have second number.."));
        System.out.println("The Second Smallest Element in the Given Array: " + secondSmallestNumber);

    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1, 1};
        fetchSecondSmallestNum(numbers);
    }
}
