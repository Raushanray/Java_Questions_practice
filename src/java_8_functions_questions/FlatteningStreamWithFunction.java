package java_8_functions_questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatteningStreamWithFunction {
    public static void main(String[] args) {
        List<List<Integer>> multiLevelList = Arrays.asList(
                Arrays.asList(2, 3, 4),
                Arrays.asList(5, 6, 7),
                Arrays.asList(8, 9, 10)
        );

        Function<List<Integer>, Stream<Integer>> flattenFunction = List::stream;

        List<Integer> flattenedList = multiLevelList.stream()
                .flatMap(flattenFunction)
                .collect(Collectors.toList());

        System.out.println("Flattened List : " + flattenedList);
    }
}


//output:- Flattened List : [2, 3, 4, 5, 6, 7, 8, 9, 10]