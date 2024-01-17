package java_8_functions_questions.calculater;

import java.util.Scanner;

public class BasicCalculater {
    public static void main(String[] args) {

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Welcome to the Basic Calculator...!!!");
//
//        while(true) {
//            System.out.print("Enter the First number:");
//            double num1=scanner.nextDouble();
//
//            System.out.print("Enter operator (+, -, *, /): ");
//            char operator = scanner.next().charAt(0);
//
//            System.out.print("Enter the Second number:");
//            double num2=scanner.nextDouble();
//
//            double result = 0;
//
//            switch(operator) {
//                case '+' :
//                    result = num1+num2;
//                    break;
//                case'-':
//                    result=num1-num2;
//                    break;
//                case'*':
//                    result = num1*num2;
//                    break;
//                case'/':
//                    if (num2==0) {
//                        System.out.println("Error cannot divide by Zero");
//                    }else {
//                        result = num1/num2;
//                    }
//                    break;
//                case
//                        5:
//                    System.out.println("Exixting calculator...");
//                    System.exit(0);
//
//                default:
//                    System.out.println("Invalid operation.please try again.");
//                    continue;
//
//            }
//            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
//
//            System.out.print("Do you want to perform another calculation? (y/n): ");
//            char choice = scanner.next().charAt(0);
//            if (choice != 'y') {
//                break;
//            }
//
//        }
//        System.out.println("Thank you for using!!");
//        scanner.close();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the simple calculator!");

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
                    continue;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.print("Do you want to perform another calculation? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice != 'y') {
                break;
            }
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
