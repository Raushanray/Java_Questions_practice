package java_8_functions_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAllNumbersFinder {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 8, 6, 7, 10, 5, 15};
        List<Integer> missingNumber = findMissingNumber(nums);

        System.out.println("Missing Number : " + missingNumber);
    }

    public static List<Integer> findMissingNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missingNumbers = new ArrayList<>();

        int expectedNumber = 1;
        for (int num : nums) {
            while (expectedNumber < num) {

                missingNumbers.add(expectedNumber);
                expectedNumber++;
            }
            expectedNumber = num + 1;
        }
        int maxNum = nums[nums.length - 1];
        while (expectedNumber <= maxNum) {
            missingNumbers.add(expectedNumber);
            expectedNumber++;
        }
        return missingNumbers;
    }
}
