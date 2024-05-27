package java_8_functions_questions.streamExample;

import java.util.Arrays;
import java.util.List;

public class FindFirstMethodExamp {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Avocado");
        /*
        This java code is using Java Streams to filter a list of fruits and find the first fruit that starts with the
         latter 'B'.
        if Such a fruit is found, it prints a message indicating the first fruit stating with 'B',
        otherwise, it prints a message stating that no fruit Stating with 'B' was found.

        Output:
        the output of this code will be:
        First Fruit Stating with letter 'B' : Banana
         */
        myList.stream().filter(f -> f.startsWith("B"))
                .findFirst()
                .ifPresentOrElse(
                        fruit -> System.out.println("First fruit stating with letter 'B': " + fruit),
                        () -> System.out.println("No fruit stating with letter 'B'")
                );
    }
}
