package java_8_functions_questions.string.demo;
/*
Q>. Count the number of occurrences of a specific element in the list using java8 features.
input: "apple", "orange", "papaya", "apple", "Mango", "apple"
output: Occurrence of apple are: 3
 */

import java.util.Arrays;
import java.util.List;

public class OccurrenceTheWordInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "papaya", "apple", "Mango", "apple");
        long count = words.stream().filter(word -> word.equals("apple")).count();
        System.out.println("Occurrence of apple are: " + count);
    }
}
