package java_8_functions_questions.streamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxExmp {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 6, 9, 7, 3, 8, 10, 23, 25);

        /*
        This Program prints the maximum value if the list is not empty.

        .max(Comparator.naturalOrder()): This finds the maximum element in the stream using natural ordering(ascending order for integers).

        .ifPresentOrElse(...): This method taks two arguments: a consumer for the value if it's preset, and a Runnable to execute if the value is not present.


        value -> System.out.println("maximum Value: " + value): This is the Consumer that prints the maximum value if it's present
         */

        myList.stream().max(Comparator.naturalOrder())
                .ifPresentOrElse(
                        value -> System.out.println("Maximum Value: " + value),
                        () -> System.out.println("List is empty")
                );
    }
}
