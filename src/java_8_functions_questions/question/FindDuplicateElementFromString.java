package java_8_functions_questions.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Java program to find All duplicate element
 */
public class FindDuplicateElementFromString {
    public static void main(String[] args) {
        String s = "IloveJavaProgrammingLangauge";
        List<String> duplicateElements = Arrays.stream(s.split("")).collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElements);
    }
}
/*
output: [a, e, g, m, n, o, r, v]
 */