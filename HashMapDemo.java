package Saturday_Assessment;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap to store Person objects with an ID as the key
        Map<Integer, Person> personMap = new HashMap<>();

        // Add Person objects to the HashMap with unique IDs
        personMap.put(1, new Person("Hemanth", 70000));
        personMap.put(2, new Person("Chaitanya", 74000));
        personMap.put(3, new Person("MMK", 100000));

        // Print all Person objects in the HashMap
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            Integer id = entry.getKey();
            Person person = entry.getValue();
            System.out.println("ID: " + id + " -> " + person);
        }

        // Retrieve a Person object by ID
        int searchId = 3;
        Person person = personMap.get(searchId);
        System.out.println("Person with ID " + searchId + ": " + person);

        // Print all Person objects after removal
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            Integer id = entry.getKey();
            Person p = entry.getValue();
            System.out.println("ID: " + id + " -> " + p);
        }
    }
}
