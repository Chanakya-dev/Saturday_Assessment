import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> primitiveMap = new HashMap<>();
        primitiveMap.put(1, "Value1");
        primitiveMap.put(2, "Value2");
        
        System.out.println("Primitive HashMap (for-each):");
        for (Map.Entry<Integer, String> entry : primitiveMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        HashMap<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person("Kamal", 23));
        personMap.put(2, new Person("Uppi", 22));
        
        System.out.println("Person HashMap (for-each):");
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
