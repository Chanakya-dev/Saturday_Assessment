package Saturday_Assessment;

import java.util.HashMap;
import java.util.Map;

public class HashMaps 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "three");
        map.put(7, "Two");
        map.put(3, "Two");
        map.put(4, "Four");
        map.put(5, "Five");
        System.out.println(map);
    }
}
