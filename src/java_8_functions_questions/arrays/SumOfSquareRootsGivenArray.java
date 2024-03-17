package java_8_functions_questions.arrays;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareRootsGivenArray {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        double sumOfSquareRoots = numbers.stream().map(Math::sqrt).mapToDouble(Double::doubleValue).sum();

        System.out.println("Sum of Square Roots: " + sumOfSquareRoots);
    }
}
