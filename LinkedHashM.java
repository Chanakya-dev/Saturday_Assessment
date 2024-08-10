package Saturday_Assessment;

import java.util.LinkedHashMap;



public class LinkedHashM {
    public static void main(String[] args) {
        LinkedHashMap<Person, Integer> hm = new LinkedHashMap<>();
        hm.put(new Person("Ranjith", 56), 56);
        hm.put(new Person("Rajesh", 78), 78);
        hm.put(new Person("Suresh", 89), 89);
        System.out.println(hm);
        for (Person person : hm.keySet()) {
            System.out.println(person + " " + hm.get(person));
        }
    }
}
        

    

