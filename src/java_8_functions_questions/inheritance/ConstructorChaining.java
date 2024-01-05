package java_8_functions_questions.inheritance;

class Parent1 {
    Parent1() {
        System.out.print("Parent ");
    }
}

class Child1 extends Parent1 {
    Child1() {
        this(1);
        System.out.print("Child ");
    }

    Child1(int a) {
        System.out.print("Child ");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Child1 child = new Child1();
    }
}