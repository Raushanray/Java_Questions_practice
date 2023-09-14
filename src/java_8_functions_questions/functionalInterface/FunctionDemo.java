package java_8_functions_questions.functionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        FunctionDemo functionDemo = new FunctionDemo();
        System.out.println(functionDemo.squareInt(5));
//Using the Function of FunctionalInterface
        Function<Integer, Integer> squareMe = i -> i * i;
        System.out.println("Square of given Input: " + squareMe.apply(5));
    }

    //normal way to..
    public int squareInt(int i) {
        int squared = i * i;
        return squared;
    }

}
