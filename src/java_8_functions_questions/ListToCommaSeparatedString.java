package java_8_functions_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToCommaSeparatedString {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        String commaSeparatedString = convertToCommaSeparatedString(numbers);

        System.out.println("List To Comma Separated String :-" + commaSeparatedString);

    }

    private static String convertToCommaSeparatedString(List<Integer> numbers) {
        return numbers.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
}
