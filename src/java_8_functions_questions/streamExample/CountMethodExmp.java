package java_8_functions_questions.streamExample;

import java.util.Arrays;

public class CountMethodExmp {
    public static void main(String[] args) {
        /*
        This java program creates a list of integers from 1 to 10, converts it into  a stream using Arrays.asList(), and then counts the number of elements in the stream using the count() method.
        finally it prints out the total count.

Output:
the output of this code will be:
Total Count: 10
         */
        long count = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().count();
        System.out.println("Total Count: " + count);

    }
}
