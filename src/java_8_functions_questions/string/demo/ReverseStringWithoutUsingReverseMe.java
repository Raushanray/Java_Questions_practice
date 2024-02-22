package java_8_functions_questions.string.demo;

/*
Write a code to reverse a String without using inbuilt reverse() method.
input: String string = "Java Programming"
output: Reverse String Without Using Reverse Method: gnimmargorP avaJ
 */
public class ReverseStringWithoutUsingReverseMe {
    public static void main(String[] args) {
        String string = "Java Programming";
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result = result + string.charAt(i);

        }
        System.out.println("Reverse String Without Using Reverse Method: " + result);
    }
}
