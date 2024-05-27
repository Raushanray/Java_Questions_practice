package java_8_functions_questions.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethodExamp {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Avocado");

        /*
        So, the collect method is used here to gather the filtered elements into a new list.

        We apply a filter using the filter() method to keep only those strings that start with a Letter "A".

        Finally, we collect the filtered elements into a new list using the collect() method with Collectors.toList() collector.


Output:
the output of this code will be:
filtered list: [Apple, Apricot, Avocado]
         */

        List<String> filterdList = myList.stream()
                .filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(filterdList);
    }
}
