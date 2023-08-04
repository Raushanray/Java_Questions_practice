package java_8_functions_questions;
/*
The peek method in Java 8 streams allows you to perform a non-destructive,
 intermediate operation on the elements of the stream. It is often used for debugging and monitoring purposes,
  as it allows you to inspect the elements as they flow through the stream without changing the stream's content.
 */

import java.util.Arrays;
import java.util.List;

public class PeekMethodExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        List<String> modifiedFruits = fruits.stream()
                .peek(fruit -> System.out.println("Before modification: " + fruit))
                .map(String::toUpperCase)
                .peek(fruit -> System.out.println("After modification: " + fruit))
                .toList();
        System.out.println("Modified Fruits : " + modifiedFruits);
    }
}

/*
output:-

Before modification: apple
After modification: APPLE
Before modification: banana
After modification: BANANA
Before modification: orange
After modification: ORANGE
Before modification: grape
After modification: GRAPE
Before modification: kiwi
After modification: KIWI
Modified Fruits : [APPLE, BANANA, ORANGE, GRAPE, KIWI]
 */

