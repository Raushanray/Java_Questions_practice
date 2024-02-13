package java_8_functions_questions.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class GroupByExample {
    public static void main(String[] args) {

        //create preson
        List<Person> people = Arrays.asList(
                new Person("Ravi", 23),
                new Person("Aman", 26),
                new Person("Mahesh", 27),
                new Person("Sumit", 22),
                new Person("Tannu", 21),
                new Person("Guriya", 21),
                new Person("Priyanka", 21)
        );

        Map<Integer, List<Person>> peopleByAge = groupByAge(people);
        peopleByAge.forEach((age, persons) -> {
            System.out.println("Age: " + age);
            persons.forEach(System.out::println);
            System.out.println();
        });


    }

    private static Map<Integer, List<Person>> groupByAge(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getAge));
    }
}
