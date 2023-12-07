package java_8_functions_questions.arrays.code;
/*
 * Write a java 8 program to reverse an array of integers in-place.
 *  input: int[] numbers = {1,2,3,4,5};
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void reverseGivenArrayInPlace(int[] arr) {
        IntStream.range(0, arr.length / 2).forEach(i -> {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        });
        System.out.println("Reverse order: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseGivenArrayInPlace(arr);
    }
}
