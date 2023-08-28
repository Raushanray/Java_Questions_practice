package java_8_functions_questions.method;

interface Shape {
    static void printType() {
        System.out.println("This is a shape interface..");
    }

    double calculateArea();

    default void printInfo() {
        System.out.println("This is shape..");
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class DefAndStaticMethod {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area: " + circle.calculateArea());
        circle.printInfo();
        Shape.printType();
    }
}
