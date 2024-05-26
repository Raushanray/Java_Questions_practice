package java_8_functions_questions.arrays.code;

public class NextCharConverter {
    public static void main(String[] args) {
        String input = "abcd";
        String output = convertString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    private static String convertString(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'z') {
                    result += 'a';
                } else if (c == 'Z') {
                    result += 'A';
                } else {
                    result += (char) (c + 1);
                }
            } else {
                result += c;
            }
        }
        return result;
    }
}
