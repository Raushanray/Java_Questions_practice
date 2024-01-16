package java_8_functions_questions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "silent";
        String str1 = "listen";

        char[] ch = str.toCharArray();
        char[] ch1 = str1.toCharArray();

        if (ch.length != ch1.length) {
            System.out.println("Not an anagram");
            System.exit(0);
        }

        Arrays.sort(ch);
        Arrays.sort(ch1);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch1[i]) {
                System.out.println("Not an anagram");
                System.exit(0);
            }
        }
        System.out.println("It is an anagram");
    }
}
