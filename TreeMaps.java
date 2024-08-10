package Saturday_Assessment;
import java.util.TreeMap;
import java.util.Iterator;


public class TreeMaps {

    private static String key;

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(1, "HI");
        treeMap.put(2, "Hello");
        treeMap.put(3,"Namaste");
        treeMap.put(1,"Bye");


        for (Integer key : treeMap.keySet()) {
            System.out.println(key + " => " + treeMap.get(key));
        }
        System.out.println();
        System.out.println();

        TreeMap<Person1, String> treeMap1 = new TreeMap<Person1, String>();
        treeMap1.put(new Person1("Remo", 15000), "HI");
        treeMap1.put(new Person1("Ramu", 24000), "Hello");
        treeMap1.put(new Person1("Aparichitudu", 100000),"Bye");

        Iterator<Person1> it = treeMap1.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
        

    

    
}
