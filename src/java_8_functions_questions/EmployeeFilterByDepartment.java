package java_8_functions_questions;
/*
Expand on the employee example. Given a list of employees,
use a Predicate to filter and print employees of a specific department.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class EmployeeFilterByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ravi", 100000, "Hr"));
        employees.add(new Employee("sumit", 75000, "IT"));
        employees.add(new Employee("tannu", 80000, "Finance"));
        employees.add(new Employee("amit", 70000, "IT"));

        // Define the Predicate to filter employees by department
        Predicate<Employee> itDepartmentFilter = employee -> employee.getDepartment().equals("IT");

        // Filter and print employees of the IT department
        System.out.println("Employees in the IT Department:");
        employees.stream()
                .filter(itDepartmentFilter)
                .forEach(employee -> System.out.println(employee.getName()));

    }
}
