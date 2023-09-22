package leetcode.easy.p1021_remove_outermost_parentless;

public class Main {

    public static void main(String[] args) {
        String input = "(()())(())";
        System.out.println(input);

        Solution s = new Solution();
        input = s.removeOuterParentheses(input);
        System.out.println(input);

    }



}
