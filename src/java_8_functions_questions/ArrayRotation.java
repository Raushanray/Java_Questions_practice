package java_8_functions_questions;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotateBy = 3;
        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArray(arr, rotateBy);
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int rotateBy) {
        int length = arr.length;
        rotateBy = rotateBy % length;  // Handle cases where rotateBy is greater than array length

        int[] result = Arrays.copyOfRange(arr, length - rotateBy, length);
        System.arraycopy(arr, 0, arr, rotateBy, length - rotateBy);
        System.arraycopy(result, 0, arr, 0, rotateBy);
    }
}
