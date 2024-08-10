package Saturday_Assessment;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Ranjith", 56);
        hm.put("Rajesh", 78);
        hm.put("Suresh", 89);
        System.out.println(hm);
        Iterator<String> it = hm.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = hm.get(key);
            System.out.println(key+" "+value);
        }
    }
    
}
