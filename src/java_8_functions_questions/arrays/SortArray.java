package java_8_functions_questions.arrays;
/*
write a code to sort an array
i/p = {4,6,2,3,1}
o/p = [1, 2, 3, 4, 6]
 */

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 3, 1};

//        for (int i = 0; i < a.length; i++) {
//            for (int j = i+1; j < a.length; j++) {
//                if (a[i] > a[j]){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//
//            }
//        }

        // 2nd way
        Arrays.sort(a);
        System.out.println("Sort An Array " + Arrays.toString(a));
    }
}
