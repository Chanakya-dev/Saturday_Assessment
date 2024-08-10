package Saturday_Assessment;

import java.util.Objects;

public class Person1 {
    private String name;
    private int salary;

    public Person1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', salary=" + salary + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return salary == Person.Salary && Objects.equals(name, person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
