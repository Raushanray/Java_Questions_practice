package java_8_functions_questions.commonQuestion;
/*
Remove Strings from List which has 'an' present in it using java 8.
input:"apple","orange", "grapes", "banana", "mango", "pineapple", "plume"
output:Remove Elements With Stream: [apple, grapes, pineapple, plume]
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementsWithStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "grapes", "banana", "mango", "pineapple", "plume");
        String subString = "an";
        List<String> collect = strings.stream().filter(w -> !w.contains(subString)).collect(Collectors.toList());
        System.out.println("Remove Elements With Stream: " + collect);
    }
}
