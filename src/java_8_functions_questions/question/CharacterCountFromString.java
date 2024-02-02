package java_8_functions_questions.question;
/*
Q. Java Program to count the occurrence of each character in String.
Ex: IloveJavaProgrammingLangauge
output:- {a=5, e=2, g=4, i=1, I=1, J=1, L=1, l=1, m=2, n=2, o=2, P=1, r=2, u=1, v=2}
 */

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountFromString {
    public static void main(String[] args) {
        String s = "IloveJavaProgrammingLangauge";
        Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
