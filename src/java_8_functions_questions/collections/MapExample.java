package java_8_functions_questions.collections;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(15);
        lists.add(12);
        lists.add(8);
        lists.add(19);
        lists.stream().map(i -> i * i).forEach(System.out::println);
    }
}
