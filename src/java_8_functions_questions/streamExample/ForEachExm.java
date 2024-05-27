package java_8_functions_questions.streamExample;

import java.util.Arrays;
import java.util.List;

public class ForEachExm {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a", "b", "c", "d", "e");
        myList.stream().map(String::toUpperCase).forEach(System.out::println);
         /*This methods is convert each string in the Stream to its uppercase form.
         each element in the stream "a", "b", "c", "d", "e" is transformed to "A", "B", "C", "D", "E" respectively.*/

       /* output:
        The output of the given program:
        A,B,C,D,E*/


    }
}
