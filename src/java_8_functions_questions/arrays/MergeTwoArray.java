package java_8_functions_questions.arrays;
//write a code for merge the two array in single array.
//input int[]  a = {1,2,3};
//        int[]  b = {4,5,6};
//output: [1, 2, 3, 4, 5, 6]

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[j + a.length] = b[j];
        }

        System.out.println(Arrays.toString(c));
    }
}
