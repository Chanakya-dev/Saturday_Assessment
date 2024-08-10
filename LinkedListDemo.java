package Saturday_Assessment;

import java.util.LinkedList;
import java.util.Iterator;

// Define the Person class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create an Object for LinkedList
        LinkedList<Person> list = new LinkedList<>();

        // Add Person objects in it
        list.add(new Person("Yash", 30));
        list.add(new Person("Hemanth", 40));
        list.add(new Person("Manoj", 35));
        

        // Iterate that List using Iterator
        Iterator<Person> iterator = list.iterator();

        // Print it by using while loop
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}