package Saturday_Assessment;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps 
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(1, "One");
        map.put(6, "Two");
        map.put(4, "Four");
        map.put(4, "Three");
        map.put(5, "Five");

        System.out.println(map);
    }
}
