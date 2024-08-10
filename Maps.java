import java.util.*;

public class Maps {
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        // Creation of map
        Map<Integer, String> m = new HashMap<>();

        // Addition of elements into a map
        m.put(100, "Mumbai");
        m.put(200, "Chennai");
        m.put(300, "Guntur");

        // Retrieval of keys from map
        Set<Integer> keys = m.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        // Retrieval of values from the map
        Collection<String> values = m.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println();

        // Retrieval of value from the map based on key
        System.out.println(m.get(100));
        System.out.println();

        // To get all keys and values
        for (Integer key : keys) {
            System.out.println(key + " >>>> " + m.get(key));
        }
        System.out.println(m);

        // Deletion of elements from the map
        m.remove(200);
        System.out.println(m);
        m.clear();
        System.out.println(m);

        // To see if key is present or not
        System.out.println(m.containsKey(100));
        System.out.println(m.containsKey(400));

        // To see if value is present or not
        System.out.println(m.containsValue("Hyderabad"));
        System.out.println("Guntur");
        System.out.println();

        // Update the values
        m.put(100, "Mumbai");
        System.out.println(m);
        m.replace(100, "Delhi");
        System.out.println(m);

        // How many elements are there in map
        System.out.println(m.size());
        System.out.println();

        m.clear();
        System.out.println(m);

        // Entry using int, string in map
        Set<Map.Entry<Integer, String>> entries = m.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " >>> " + value);
        }
    }
}
