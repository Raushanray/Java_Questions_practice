package java_8_functions_questions.functionalInterface;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {

        Predicate<String> checkStringLength = s -> s.length() >= 5;
        System.out.println("the length of string is greater than 5: " + checkStringLength.test("Java Language"));

        Predicate<String> checkEvenLength = s -> s.length() % 2 == 0;
        System.out.println("the length of string is greater than 5: " + checkEvenLength.test("Java Language"));

        //it can be joined with "and"
        System.out.println("After merging with 'and' " + checkStringLength.and(checkEvenLength).test("Java Language"));

        //it can be joined with "or"
        System.out.println("After merging with 'or' " + checkStringLength.or(checkEvenLength).test("Java Language"));

        //it can be joined with "negate"
        System.out.println("After merging with 'or' " + checkStringLength.negate().test("Java Language"));


    }
}
