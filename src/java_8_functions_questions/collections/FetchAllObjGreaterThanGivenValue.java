package java_8_functions_questions.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FetchAllObjGreaterThanGivenValue {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(10);
        lists.add(18);
        lists.add(36);
        lists.add(12);
        lists.add(14);
        lists.add(16);
        //without stream
        /*List<Integer> asListFromMethod = findElement(lists);
        for (Integer i : asListFromMethod){
            System.out.println(i);
        }

    }

    private static List<Integer> findElement(List<Integer> lists) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : lists){
            if (i >= 15){
                newList.add(i);
            }

        }
        return newList;
    }*/

//        with stream
//        lists.stream().filter(x -> x >= 15).collect(Collectors.toList()).forEach(System.out::println);
//        List<Integer> integerList = lists.stream().filter(x -> x >= 15).collect(Collectors.toList());
//        List<Integer> integerList = lists.stream().filter(x -> x >= 15).toList();
//                integerList.forEach(System.out::println);
          lists.stream().filter(x -> x >= 15).toList().forEach(System.out::println);
    }
}
