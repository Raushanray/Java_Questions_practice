package java_8_functions_questions.core;

class Animal1 {
    public Animal1() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal1 {
    public Dog() {
        System.out.println("Dog is created");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
