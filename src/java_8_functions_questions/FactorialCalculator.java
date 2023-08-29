package java_8_functions_questions;
/**
 * Q> Calculate the factorial of a number using 'IntStream' ?
 * <p>
 * the program calculates the factorial of the number 5, which is 5! = 5 x 4 x 3 x 2 x 1 = 120,
 * and displays the result.
 */
/**
 * the program calculates the factorial of the number 5, which is 5! = 5 x 4 x 3 x 2 x 1 = 120,
 * and displays the result.
 */

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int factorial = calculateFactorial(number);

        System.out.println("Factorial of  \"" + number + "\" is " + factorial);
    }

    private static int calculateFactorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
}
/**
 * OutPut:-
 * Enter a number :
 * 5
 * Factorial of  "5" is 120
 */