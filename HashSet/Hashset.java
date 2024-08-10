package HashSet;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("Hello");
        s.add("World");
        s.add("Java");
        s.add("Programming");
        s.add("Language");
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
