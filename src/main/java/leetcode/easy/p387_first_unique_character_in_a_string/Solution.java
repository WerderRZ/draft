package leetcode.easy.p387_first_unique_character_in_a_string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {

        char[] input = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char sym : input) {
            map.put(sym, map.getOrDefault(sym, 0) + 1);
            //map.computeIfPresent(sym, (k,v) -> v + 1);
            //Integer value = map.putIfAbsent(sym, 1);
            //if (value != null) {
            //    map.put(sym, value + 1);
            //}
        }

        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                return s.indexOf(key);
            }
        }

        return -1;
    }
}
