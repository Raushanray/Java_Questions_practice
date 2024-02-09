package java_8_functions_questions.string.demo;
//Write a code to find the Frequency Of String in the given String.

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {
    public static void main(String[] args) {
        String input = "Language";
//        IntStream inputStream = input.chars();
//        Stream<Character> characterStream = inputStream.mapToObj(c -> (char) c);
//        Map<Character, Long> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);
        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
