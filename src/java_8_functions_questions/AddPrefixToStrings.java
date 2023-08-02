package java_8_functions_questions;

/*
Write a Java 8 program that takes a list of strings as input and uses a function
to add a prefix to each string. Then, return the list of modified strings as a new list.
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddPrefixToStrings {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        String prefix = "fruit_";
        Function<String , String> addPrefixFunction = str -> prefix + str;
        List<String> modifiedStrings = strings.stream().map(addPrefixFunction).collect(Collectors.toList());
        System.out.println("modified Strings : " + modifiedStrings);
    }
}


/*
output:-
modified Strings : [fruit_apple, fruit_banana, fruit_orange, fruit_grape, fruit_kiwi]
 */