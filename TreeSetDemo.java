package Saturday_Assessment;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

// Main class to demonstrate TreeSet with custom sorting
public class TreeSetDemo {
  public static void main(String[] args) {
      // Create a TreeSet with the custom NameComparator
      Set<Person> dataSet = new TreeSet<>(new NameComparator());

      // Add Person objects to the TreeSet
      dataSet.add(new Person("Hemanth", 70000));
      dataSet.add(new Person("Chaitanya", 74000));
      dataSet.add(new Person("MMK", 100000));

      // Print the sorted TreeSet
      for (Person person : dataSet) {
          System.out.println(person);
      }
  }
}