package Saturday_Assessment;

import java.util.TreeMap;

public class Treema {

    public static void main(String[] args) {
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        hm.put(1, "Ranjith");
        hm.put(2, "Rajesh");
        hm.put(3, "Suresh");
        System.out.println(hm);
        for (Integer key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }
    }
    
}
