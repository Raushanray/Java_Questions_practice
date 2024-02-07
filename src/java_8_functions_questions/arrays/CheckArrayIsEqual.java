package java_8_functions_questions.arrays;
//Write a code to compare two given array is same or not where order doesn't matter, but size of the array
//should be same.

import java.util.Arrays;

public class CheckArrayIsEqual {

    public static boolean areEqual(int arr1[], int arr2[]) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        if (a1 != a2) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < a1; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 3, 5, 4, 2};
        if (areEqual(arr1, arr2)) {
            System.out.println("Both arrays are equal");
        } else
            System.out.println("Both array are not equal!");
    }
}
