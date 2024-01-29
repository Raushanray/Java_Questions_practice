package java_8_functions_questions.arrays;

import java.util.Arrays;
import java.util.List;

public class CommonElement {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(3, 5, 6, 4, 8, 9, 11, 18);
        List<Integer> l2 = Arrays.asList(3, 9, 8, 2, 15);
        System.out.println("Find the common element of both list: ");
        l1.stream().filter(l2::contains).forEach(System.out::println);
        System.out.println("=====================================");

        l1.stream().filter(n -> String.valueOf(n).startsWith("1")).forEach(System.out::println);
//        System.out.println(list1);
    }
}
