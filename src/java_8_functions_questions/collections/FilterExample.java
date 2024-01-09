package java_8_functions_questions.collections;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(12);
        lists.add(15);
        lists.add(17);
        lists.add(18);
        lists.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
