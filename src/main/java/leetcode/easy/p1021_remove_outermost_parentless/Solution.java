package leetcode.easy.p1021_remove_outermost_parentless;

class Solution {
    public String removeOuterParentheses(String s) {
        char[] input = s.toCharArray();
        StringBuilder output = new StringBuilder();
        char close = ')';

        int opened = 0;
        int size = 0;

        for (char symbol : input) {

            if (symbol != close) {
                opened++;
                if (opened > size) {
                    size = opened;
                }
            } else {
                opened--;
            }

            if (opened != 0) {
                if (size > 1) {
                    output.append(symbol);
                }
            } else {
                size = 0;
            }

        }

        return output.toString();
    }

}
