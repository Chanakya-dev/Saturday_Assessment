package HashSet;
import java.util.*;


public class SortBySalary implements Comparator<Person2>{

    @Override
    public int compare(Person2 o1, Person2 o2) {
        return Double.compare(o1.getSalary(),o2.getSalary());
    }
    
}
