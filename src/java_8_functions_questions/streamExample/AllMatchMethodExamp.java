package java_8_functions_questions.streamExample;

import java.util.Arrays;
import java.util.List;

public class AllMatchMethodExamp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        /*
        We call the allMatch method on the stream and pass a lambda expression n -> n % 2 ==0 as a predicate.
        this lambda expression checks if each number in the stream is even( n % 2 ==0).
         if all the elements satisfy this condition, allMatch returns true, otherwise, it returns false.
         */

        boolean alleven = numbers.stream().allMatch(n -> n % 2 == 0);
        if (alleven) {
            System.out.println("All numbers are even");
        } else {
            System.out.println("Some numbers are not even");
        }

        /*
        Output:
        The output of this code will be:
        All numbers are even
         */
    }
}
