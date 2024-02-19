package java_8_functions_questions.core;

public class StringExm1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = s1;
        boolean result = (s1 == s2) && (s1 == s3);

        System.out.println(result);
    }
}
