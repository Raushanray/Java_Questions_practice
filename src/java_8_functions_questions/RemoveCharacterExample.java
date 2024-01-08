package java_8_functions_questions;

public class RemoveCharacterExample {
    public static void main(String[] args) {
        String str = "Java Language";
        char ch = 'a';
        removeCharacter(str, ch);
    }

    private static void removeCharacter(String str, char ch) {
        int n = str.length();
        String finalStr = "";

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ch) {
                finalStr = finalStr + str.charAt(i);
            }

        }
        System.out.println(finalStr);
    }
}

