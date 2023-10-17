package java_8_functions_questions.thread;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrintEvenAndOddNumbers {

    private static Object object = new Object();

    private static IntPredicate evenCondition = e -> e % 2 == 0;
    private static IntPredicate oddCondition = e -> e % 2 != 0;

    public static void printResult(IntPredicate condition) {
        IntStream.rangeClosed(1, 10).filter(condition).forEach(PrintEvenAndOddNumbers::execute);
    }

    public static void execute(int i) {
        synchronized (object) {
            try {
                System.out.println("Thread name : " + Thread.currentThread().getName() + " : " + i);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                //error log
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.runAsync(() -> PrintEvenAndOddNumbers.printResult(oddCondition));
        CompletableFuture.runAsync(() -> PrintEvenAndOddNumbers.printResult(evenCondition));
        Thread.sleep(1000);
    }
}
