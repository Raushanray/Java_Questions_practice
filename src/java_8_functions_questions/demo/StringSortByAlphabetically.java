package java_8_functions_questions.demo;
/*
Write a code to sort a list of Strings alphabetically using java8 using Stream api.
input: "mango", "orange", "grapes", "pear", "cherry", "apple", "jackfruit"
output:apple
cherry
grapes
jackfruit
mango
orange
pear

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortByAlphabetically {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("mango", "orange", "grapes", "pear", "cherry", "apple", "jackfruit");
        words.stream().sorted().collect(Collectors.toList()).forEach(word -> System.out.println(word));
    }
}
