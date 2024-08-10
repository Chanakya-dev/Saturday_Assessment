package Saturday_Assessment.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSets{
    public static void main(String[] args) {
  Set <Person1>per=new HashSet<Person1>();
     per.add(new Person1(1, "Chanakya", 234, "Dev"));
     per.add(new Person1(5, "Chanakya", 234, "Dev"));
     per.add(new Person1(7, "Chanakya", 234, "Dev"));
     per.add(new Person1(9, "Chanakya", 234, "Dev"));
  
     for (Person1 person : per) {
      System.out.println(person);
     } 
    }
}
