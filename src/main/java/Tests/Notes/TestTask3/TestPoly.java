package Tests.Notes.TestTask3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestPoly {
    public static void main(String[] args) {
        Map<String, String> hashMap1 = new HashMap<>();
        Map<String, String> hashMap2 = new TreeMap<>();

        hashMap1.put("test", "from Map 1");
        hashMap2.put("test", "from Map 2");

        testMap(hashMap1);
        testMap(hashMap2);

    }

    private static void testMap(Map<String, String> map) {
        if (map instanceof TreeMap) {
            var tm = (TreeMap) map;
            tm.descendingMap();
        }
        System.out.println(map.get("test"));
    }
}
