package java_8_functions_questions;

import java.util.Arrays;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 8, 6, 7, 10, 5};   // Replace this array with your input
        int missingNumber = findMissingNumber(nums);

        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(int[] nums) {
        Arrays.sort(nums);  // Sort the array in ascending order
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;  // Return the first number that doesn't match its index
            }
        }
        // If all numbers are in order, the missing number is N + 1
        return nums.length + 1;
    }
}
