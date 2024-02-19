package java_8_functions_questions.core;

class Animal {
    String sound() {
        return "Generic Sound";
    }
}

class Dogs extends Animal {
    @Override
    String sound() {
        return "bark";
    }
}

public class OverrideMethod {
    public static void main(String[] args) {
        Animal animal = new Dogs();
        System.out.println(animal.sound());
    }
}
