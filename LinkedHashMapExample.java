import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> primitiveMap = new LinkedHashMap<>();
        primitiveMap.put(1, "Value1");
        primitiveMap.put(2, "Value2");

        System.out.println("Primitive LinkedHashMap (for-each):");
        for (Map.Entry<Integer, String> entry : primitiveMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        LinkedHashMap<Integer, Person> personMap = new LinkedHashMap<>();
        personMap.put(1, new Person("Kamal", 22));
        personMap.put(2, new Person("Uppi", 24));

        System.out.println("Person LinkedHashMap (for-each):");
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
