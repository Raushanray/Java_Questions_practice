package java_8_functions_questions.core;

/*
Q>. Write a code for finding the length of the last word in the given String
input = "Hello java programming";
output = length of the last word: 11
 */
public class FindLengthOfLastWord {

    static int lengthOfLastWord(String input) {
        String s = input.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;

            } else {
                break;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Hello java programming";
        System.out.println("length of the last word: " + lengthOfLastWord(input));
    }
}
