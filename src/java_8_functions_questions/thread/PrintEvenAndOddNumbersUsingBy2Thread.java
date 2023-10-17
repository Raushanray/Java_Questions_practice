package java_8_functions_questions.thread;

public class PrintEvenAndOddNumbersUsingBy2Thread implements Runnable {
    static int count = 1;
    Object object;

    public PrintEvenAndOddNumbersUsingBy2Thread(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Runnable r1 = new PrintEvenAndOddNumbersUsingBy2Thread(lock);
        Runnable r2 = new PrintEvenAndOddNumbersUsingBy2Thread(lock);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();

    }

    @Override
    public void run() {

        while (count <= 100) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread name : " + Thread.currentThread().getName() + ", value : " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("Thread name : " + Thread.currentThread().getName() + ", value : " + count);
                    count++;
                    object.notify();
                }
            }
        }

    }
}
