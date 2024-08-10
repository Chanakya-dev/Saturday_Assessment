package Saturday_Assessment;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSets {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        for (Integer element : set) {
            System.out.println(element);
        }

        Set<Person> p1= new LinkedHashSet<>();
        p1.add(new Person("Ram", 15));
        p1.add(new Person("Lakshman", 16));

        Iterator<Person> it1=p1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next().toString());
        }


    }
}
