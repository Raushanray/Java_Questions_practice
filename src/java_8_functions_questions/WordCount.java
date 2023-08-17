package java_8_functions_questions;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with several words.";

//        long wordCount = countWord(sentence);
//        System.out.println("Number of words: " + wordCount);
        long wordCount = Arrays.stream(sentence.split("\\s+")).count();
        System.out.println("Number of words: " + wordCount);
    }

//    private static long countWord(String sentence) {
//        return Arrays.stream(sentence.split("\\s+")).count();
//    }
}
