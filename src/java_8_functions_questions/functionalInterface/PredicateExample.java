package java_8_functions_questions.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        PredicateExample predicateExample = new PredicateExample();
        System.out.println(predicateExample.testStringLength("Java Language"));
//this is predicate functional interface example..
        Predicate<String> checkStringLength = s -> s.length() >= 5;
        System.out.println("the length of string is greater than 5: " + checkStringLength.test("Java Language"));
    }

    //this is normal way
    public boolean testStringLength(String s) {
        if (s.length() >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
