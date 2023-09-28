package leetcode.easy.p500_keyboard_row;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};

        Solution solution = new Solution();
        String[] result = solution.findWords(words);
        System.out.println(Arrays.toString(result));
    }
}
