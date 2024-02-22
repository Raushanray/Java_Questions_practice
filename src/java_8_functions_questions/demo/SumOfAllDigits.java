package java_8_functions_questions.demo;
/*
Write a code to find the sum of all digits of a numbers using java 8.
inout: numbers = 12345;
output: Sum Of all the Given Numbers: 15
 */

import java.util.stream.IntStream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int numbers = 12345; //15

        IntStream stream = String.valueOf(numbers).chars();
        int sum = stream.map(Character::getNumericValue).sum();
        System.out.println("Sum Of all the Given Numbers: " + sum);
    }
}
