package HashSet;
import java.util.*;

public class SortByName implements Comparator<Person2>{

    @Override
    public int compare(Person2 p1, Person2 p2) {
        return p1.getName().compareTo(p2.getName());
    }
    
}
