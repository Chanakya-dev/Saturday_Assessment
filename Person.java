package Saturday_Assessment;

public class Person {
    public static final int Salary = 0;
    String name;
    private int salary;

    public Person(String name, int salary) {
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
}

