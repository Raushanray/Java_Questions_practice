package java_8_functions_questions.commonQuestion;

public class Employee {
    private String id;
    private String name;
    private Integer age;
    private String department;
    private Integer Salary;

    public Employee(String id, String name, Integer age, String department, Integer salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        Salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
