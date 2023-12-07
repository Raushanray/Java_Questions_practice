package java_8_functions_questions.arrays.code;
/*
 * Given two arrays of integers, write a java 8 program to find the common elements between them.
 *  input: int[] array1 = {1,2,3,4,5};
 *  int[] array2 = {4,5,6,7,8}
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchCommonElement {
    public static void fetchCommonElement(int[] arr1, int[] arr2) {
        List<Integer> commonElement = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2)
                .anyMatch(arr2Number -> arr2Number == number)).boxed().collect(Collectors.toList());
        System.out.println("Common Element in the given array: " + commonElement);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        fetchCommonElement(array1, array2);
    }
}
