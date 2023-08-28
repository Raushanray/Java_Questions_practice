package java_8_functions_questions;

public class ReverseOrder {
    public static void main(String[] args) {
        int number = 7532;
        int result = 0;
        int reversedDigits = reverseDigits(number);

        System.out.println("Original number: " + number);

        System.out.println("=====================================================");

        while (number != 0) {
            int r = number % 10;
            result = result * 10 + r;
            number = number / 10;
        }
        System.out.println("Revrse Digits  using core concepts:- " + result);

        System.out.println("=====================================================");


        System.out.println("Revrse Digits  using java -8 :- " + reversedDigits);
    }

    private static int reverseDigits(int number) {
        return Integer.parseInt(new StringBuffer(Integer.toString(number)).reverse().toString());
    }
}
