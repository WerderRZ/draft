package leetcode.easy.p500_keyboard_row;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> al = new ArrayList<>();
        HashMap<Character, Integer> keyboardMap = getKeyboardMap();

        for (String word: words) {
            char[] charwords = word.toCharArray();
            int firstLetter = keyboardMap.get(charwords[0]);
            boolean allRight = true;
            for (int i = 1; i < charwords.length; i++) {
                if (keyboardMap.get(charwords[i]) != firstLetter) {
                    allRight = false;
                    break;
                }
            }
            if (allRight) {
                al.add(word);
            }
        }
        return al.toArray(new String[0]);
    }

    private HashMap<Character, Integer> getKeyboardMap() {
        HashMap<Character, Integer> keyboardMap = new HashMap<>();

        keyboardMap.put('q', 1);
        keyboardMap.put('w', 1);
        keyboardMap.put('e', 1);
        keyboardMap.put('r', 1);
        keyboardMap.put('t', 1);
        keyboardMap.put('y', 1);
        keyboardMap.put('u', 1);
        keyboardMap.put('i', 1);
        keyboardMap.put('o', 1);
        keyboardMap.put('p', 1);

        keyboardMap.put('Q', 1);
        keyboardMap.put('W', 1);
        keyboardMap.put('E', 1);
        keyboardMap.put('R', 1);
        keyboardMap.put('T', 1);
        keyboardMap.put('Y', 1);
        keyboardMap.put('U', 1);
        keyboardMap.put('I', 1);
        keyboardMap.put('O', 1);
        keyboardMap.put('P', 1);

        keyboardMap.put('a', 2);
        keyboardMap.put('s', 2);
        keyboardMap.put('d', 2);
        keyboardMap.put('f', 2);
        keyboardMap.put('g', 2);
        keyboardMap.put('h', 2);
        keyboardMap.put('j', 2);
        keyboardMap.put('k', 2);
        keyboardMap.put('l', 2);

        keyboardMap.put('A', 2);
        keyboardMap.put('S', 2);
        keyboardMap.put('D', 2);
        keyboardMap.put('F', 2);
        keyboardMap.put('G', 2);
        keyboardMap.put('H', 2);
        keyboardMap.put('J', 2);
        keyboardMap.put('K', 2);
        keyboardMap.put('L', 2);

        keyboardMap.put('z', 3);
        keyboardMap.put('x', 3);
        keyboardMap.put('c', 3);
        keyboardMap.put('v', 3);
        keyboardMap.put('b', 3);
        keyboardMap.put('n', 3);
        keyboardMap.put('m', 3);

        keyboardMap.put('Z', 3);
        keyboardMap.put('X', 3);
        keyboardMap.put('C', 3);
        keyboardMap.put('V', 3);
        keyboardMap.put('B', 3);
        keyboardMap.put('N', 3);
        keyboardMap.put('M', 3);

        return keyboardMap;
    }
}
