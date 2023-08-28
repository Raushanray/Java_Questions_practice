package java_8_functions_questions.string.demo;

public class NumberIsStringOrNot {
    public static void main(String[] args) {

        String input = "12345";
        boolean isNumber = checkIfNumber(input);
        if (isNumber) {
            System.out.println("The given string is a number.");
        } else {
            System.out.println("The given string is not a number.");
        }
    }

    private static boolean checkIfNumber(String input) {
        return input.chars().allMatch(Character::isDigit);
    }

}
