package java_8_functions_questions.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(12);
        arList.add(22);
        arList.add(23);
        arList.add(36);

        System.out.println("In Multiple line:");
        Stream<Integer> openStream = arList.stream();
        Stream<Integer> filteredStream = openStream.filter(x -> x >= 20);
        long countStream = filteredStream.count();
        System.out.println(countStream);

        System.out.println("In Single line:");

        long countStream1 = arList.stream().filter(y -> y >= 20).count();
        System.out.println(countStream1);
    }
}
