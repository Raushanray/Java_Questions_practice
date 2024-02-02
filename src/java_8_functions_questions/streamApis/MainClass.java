package java_8_functions_questions.streamApis;

/*
Q. Given an Employee list, sort employees based in their salaries in desc order using stream methods of
 java -8
 */
/*
and one Questions Fetch top 3 salaried employees? using Limit method of java 8?
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> empLists = new ArrayList<Employee>();
        empLists.add(new Employee(1, 2500));
        empLists.add(new Employee(2, 5000));
        empLists.add(new Employee(3, 25000));
        empLists.add(new Employee(4, 1000));
        empLists.add(new Employee(5, 3000));
        empLists.add(new Employee(6, 6000));
        empLists.add(new Employee(7, 90000));
        empLists.add(new Employee(8, 12000));

        List<Employee> sortedEmployeeLists = empLists.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
                .collect(Collectors.toList());
        System.out.println(sortedEmployeeLists);
        List<Employee> sortedTopThreeEmployeeBasedOnTheirSalary = empLists.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(sortedTopThreeEmployeeBasedOnTheirSalary);
    }
}
