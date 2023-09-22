package leetcode.easy.p20_valid_parenthses;

class Solution {
    public boolean isValid(String s) {

        if ((s.length() % 2) > 0) {
            return false;
        }

        char[] input = s.toCharArray();
        StackNode stack = null;
        StackNode stackNode;
        char nextSymbol = 0;

        for (char symbol : input) {
            if (symbol == '[') {
                nextSymbol = ']';
            } else if (symbol == '(') {
                nextSymbol = ')';
            } else if (symbol == '{') {
                nextSymbol = '}';
            } else {
                if ((stack == null) || (stack.getValue() != symbol)) {
                    return false;
                } else {
                    stack = stack.prev;
                }
                continue;
            }
            stackNode = new StackNode(nextSymbol, stack);
            stack = stackNode;
        }

        return stack == null;
    }

    private static class StackNode {

        private final char value;

        private final StackNode prev;

        public StackNode(char value, StackNode prev) {
            this.value = value;
            this.prev = prev;
        }

        public char getValue() {
            return this.value;
        }

    }
}
