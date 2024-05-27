package java_8_functions_questions.streamExample;

import java.util.Arrays;
import java.util.List;

public class ReduceMethodExmp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        /*
        we use the reduce() method to sum the elements of the list. it takes two arguments:
        An identity value, 0, which is the initial value for the sum.
        An accumulator function, (a,b)-> a+b, which specifies hoe the sum is calculated.
         */
//        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
//        System.out.println("Sum using identity and accumulator:  " + sum);
        /*
        This is a more concise way to achive the same result using a method refetence: Interger::sum
         */
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum using identity and accumulator:  " + sum);

    }
}
