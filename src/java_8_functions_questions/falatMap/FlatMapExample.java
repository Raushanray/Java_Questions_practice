package java_8_functions_questions.falatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Apple", "Orange", "Mango"),
                Arrays.asList("Grape", "Kiwi"),
                Arrays.asList("Strawberry", "Banana")
        );
        List<String> combinedList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(combinedList);
    }
}
