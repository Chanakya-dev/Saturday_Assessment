package Saturday_Assessment;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "One");
        map.put(5, "Five");
        map.put(5, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        System.out.println(map);
    }
}
