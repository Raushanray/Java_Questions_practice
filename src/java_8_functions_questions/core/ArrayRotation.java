package java_8_functions_questions.core;
/*
Q>. Write a code to rotate the array to the right by k steps where k is non-negative?
ex: inut: nums= {1,2,3,4,5,6,7,8} k = 3
output: [6,7,8,1,2,3,4,5]
 */

import java.util.Arrays;

public class ArrayRotation {

    static int[] rotationArray(int[] nums, int k) {
        int n = nums.length;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        System.out.println(Arrays.toString(rotationArray(nums, k)));

    }
}
