package java_8_functions_questions.commonQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("101", "Mahesh", 21, "Developer", 100000));
        employees.add(new Employee("102", "Raman", 26, "Engineer", 200000));
        employees.add(new Employee("106", "Deepak", 36, "Engineer", 250000));
        employees.add(new Employee("103", "Aman", 29, "po", 1500000));
        employees.add(new Employee("104", "Gautam", 31, "Computer Operator", 500000));
        employees.add(new Employee("105", "Nandan", 32, "Os Operator", 120000));
//            printEmployeeList(employees);
//            checkSalary(employees);
//            highestSalryEmplyee(employees);
//            minimumSalaryEmployee(employees);
//            printNameOfEmployee(employees);
//            sortEmployee(employees);
//            sortEmployeeReverse(employees);
//            sortEmployeeTwo(employees);
//            removeDuplicateDepartments(employees);
//        printTheNumberOfEmployee(employees);
        printDuplicateDepartments(employees);


    }


    private static void removeDuplicateDepartments(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("remove the duplicate department:");
        String distincetEmployee = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println("Remove Duplicate Departments: " + distincetEmployee);

    }

    //sort the employee based on department and name
    private static void sortEmployeeTwo(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("sort the employees based on name and department:");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName))
                .forEach(System.out::println);

    }

    private static void sortEmployeeReverse(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("sort the employees based on name in reverse order:");
        employees.stream()
                .map(Employee::getName)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void sortEmployee(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("sort the employees based on name:");
        List<Employee> sortedEmployee = employees.stream()
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("Sort the employees based on name" + sortedEmployee);
        System.out.println("=============or==============");
        String sortedEmployeeBasedOnName = employees.stream()
                .map(Employee::getName)
                .sorted().collect(Collectors.joining(", "));
        System.out.println("Sorted Employee Based On Name: " + sortedEmployeeBasedOnName);
    }

    private static void printNameOfEmployee(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("Printing the name of the  employee list using stream:");
        employees.stream()
                .filter(emp -> emp.getDepartment().equals("Engineer"))
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    private static void minimumSalaryEmployee(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("the Employee getting   minimum salary");
        String minSalaryEmployee = employees.stream().min(Comparator.comparing(Employee::getSalary)).map(Employee::getName).get();
        System.out.println("Minimum salary getting employee: " + minSalaryEmployee);
    }

    private static void highestSalryEmplyee(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("the Employee getting   highest salary");
        String maxSalaryEmployee = employees.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getName).get();
        System.out.println("The Max Salary employee: " + maxSalaryEmployee);
    }


    private static void checkSalary(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("the Employee whose salary is greater than 100000");
        employees.stream().filter(emp -> emp.getSalary() > 100000).forEach(System.out::println);
    }

    private static void printEmployeeList(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("Printing the employee list using stream:");
        employees.stream().forEach(System.out::println);
    }

    private static void printTheNumberOfEmployee(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("Printing the number of employee:");
        Map<String, Long> countEmployee = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countEmployee);

    }

    private static void printDuplicateDepartments(List<Employee> employees) {
        System.out.println("=======================================");
        System.out.println("Printing the duplicate department:");
        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        collect.entrySet()
                .stream()
                .filter(dep -> dep.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
