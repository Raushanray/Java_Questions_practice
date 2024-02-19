package java_8_functions_questions.core;

public class StringExm {
    public static void main(String[] args) {
        String input = "programming";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                output += Character.toUpperCase(c);
            } else {
                output += Character.toLowerCase(c);
            }
        }
        System.out.println(output);
    }
}
