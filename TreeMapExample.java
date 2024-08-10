import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> a = new TreeMap<>();
        a.put(1, "Value1");
        a.put(2, "Value2");

        for (Map.Entry<Integer, String> h : a.entrySet()) {
            System.out.println("Key: " + h.getKey() + ", Value: " + h.getValue());
        }

        TreeMap<Integer, Person> personMap = new TreeMap<>();
        personMap.put(1, new Person("Kamal", 21));
        personMap.put(2, new Person("Uppi", 25));

        System.out.println("Person TreeMap (for-each):");
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
