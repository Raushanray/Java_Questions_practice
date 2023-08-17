package java_8_functions_questions;

import java.util.Arrays;
import java.util.List;

/*java- 8 program to Count String whose Length Is Greater Than 3 in list?
 * ["java", "python", "you", "php", "ab", "super"]
 */
public class CountStringLengthIsGreaterThan3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "you", "php", "ab", "super");

        System.out.println("Count String Length Is GreaterThan 3 : ");
        list.stream().filter(str -> str.length() > 3).peek(System.out::println).count();

    }
}
