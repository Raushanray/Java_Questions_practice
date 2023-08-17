package java_8_functions_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByFirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "cherry", "avocado");
//        Map<Character, List<String>> results = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
//        System.out.println("Words grouped by first letter: "+ results);

        Map<Character, List<String>> groupedsByFirstLetter = groupWordsByFirstLetter(words);

        System.out.println("Words grouped by first letter:");
        groupedsByFirstLetter.forEach((letter, wordList) -> {
            System.out.println(letter + ": " + wordList);
        });

    }


    private static Map<Character, List<String>> groupWordsByFirstLetter(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
    }

}
