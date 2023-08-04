package java_8_functions_questions;

import java.util.Arrays;
import java.util.List;

public class StreamDebuggingWithPeek {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .peek(number -> System.out.println("Current element: " + number))
                .map(number -> number * 2)
                .peek(doubledNumber -> System.out.println("Doubled: " + doubledNumber))
                .filter(doubledNumber -> doubledNumber > 5)
                .peek(filteredNumber -> System.out.println("Filtered : " + filteredNumber))
                .forEach(filteredNumber -> System.out.println("Final result: " + filteredNumber));
    }
}
/*
output:-

Current element: 1
Doubled: 2
Current element: 2
Doubled: 4
Current element: 3
Doubled: 6
Filtered : 6
Final result: 6
Current element: 4
Doubled: 8
Filtered : 8
Final result: 8
Current element: 5
Doubled: 10
Filtered : 10
Final result: 10
 */