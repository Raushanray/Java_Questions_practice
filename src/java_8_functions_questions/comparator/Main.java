package java_8_functions_questions.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 20, "Rahul", new Address("street1", 213));
        Employee e2 = new Employee(2, 28, "Aman", new Address("street2", 313));
        Employee e3 = new Employee(3, 26, "Govind", new Address("street3", 3214));
        Employee e4 = new Employee(4, 24, "Parkash", new Address("street4", 1254));
        Employee e5 = new Employee(5, 27, "Manoj", new Address("street5", 854));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println("Unsorted List " + employeeList);
        System.out.println("*********************************************************");

        Collections.sort(employeeList, new AgeComparator());
        System.out.println("Sorted based on Age: " + employeeList);

        System.out.println("*********************************************************");

        Collections.sort(employeeList, new NameComparator());
        System.out.println("Sorted based on Name: " + employeeList);

        System.out.println("*********************************************************");

        Collections.sort(employeeList, new AddressComparator());
        System.out.println("Sorted based on Address: " + employeeList);
    }
}
