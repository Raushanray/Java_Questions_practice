package java_8_functions_questions;

import java.util.stream.IntStream;

public class EvenSumCalculateWithRange {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 12).filter(n -> n % 2 == 0).sum();
        System.out.println("sum of even numbers : " + sum);
    }
}
