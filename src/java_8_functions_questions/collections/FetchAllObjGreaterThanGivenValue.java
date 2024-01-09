package java_8_functions_questions.collections;
/*
If we want to process bulk objects of collection then go for stream concept.
Way to operate on collection in java-8 is stream.
its a special iterator class that allows processing collections of objects in a functional manner.

Eg: fetch all objects from collection of list whose value is greater than 15.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FetchAllObjGreaterThanGivenValue {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(10);
        lists.add(18);
        lists.add(36);
        lists.add(12);
        lists.add(14);
        lists.add(46);
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
//        lists.stream().filter(x -> x >= 15).toList().forEach(System.out::println);
        Stream<Integer> openStream = lists.stream();
        Stream<Integer> filteredStream = openStream.filter(x -> x >= 20);
        List<Integer> newFilteredStream = filteredStream.collect(Collectors.toList());
        newFilteredStream.stream().forEach(y -> System.out.println(y));
    }
}
