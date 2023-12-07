package java_8_functions_questions.arrays.code;
/*
 * Given an array of strings, write a java 8 program to find the length of the longest string.
 *  input: String[]strings = {"Apple","Banana","Avocado","Apricot","Grapes"};
 */

import java.util.Arrays;

public class LongestStringInArray {
    public static void fetchLengthOfLongestStringInArray(String[] strings) {
        int maxLength = Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);
        System.out.println("Length of Longest Stings: " + maxLength);

    }

    public static void main(String[] args) {
        String[] strings = {"Apple", "Banana", "Avocado", "Apricot", "Grapes"};
        fetchLengthOfLongestStringInArray(strings);
    }
}
