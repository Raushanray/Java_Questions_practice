package java_8_functions_questions.commonQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinct {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 4, 1, 2, 3, 5, 6);
        List<Integer> distinctedList = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("distincted List:" + distinctedList);

    }
}
