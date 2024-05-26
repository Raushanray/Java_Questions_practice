package java_8_functions_questions.ArrayVsArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //declare and initialize an array of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Access elements in the array
        System.out.println("Array Elements: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //Add a new element
        numbers.add(6);
        System.out.println("After adding an element: " + numbers);

        //size od the arrayList can grow dynamically
        System.out.println("Array Size: " + numbers.size());

        //removing an element
        numbers.remove(0);
        System.out.println("After removing  Array Size: " + numbers);
        System.out.println("Array Size: " + numbers.size());


    }

}
