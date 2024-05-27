package java_8_functions_questions.streamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinExmp {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 5, 6, 8, 7, 9);

        /*
        This Program prints the minimum value if the list is not empty.

        .min(Comparator.naturalOrder()): This finds the minimum element in the stream using natural ordering(ascending order for integers).

        .ifPresentOrElse(...): This method taks two arguments: a consumer for the value if it's preset, and a Runnable to execute if the value is not present.


        value -> System.out.println("Minimum Value: " + value): This is the Consumer that prints the minimum value if it's present
         */

        myList.stream().min(Comparator.naturalOrder())
                .ifPresentOrElse(
                        value -> System.out.println("Minimum Value: " + value),
                        () -> System.out.println("List is empty"));

    }
}
