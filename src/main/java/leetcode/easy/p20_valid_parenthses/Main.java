package leetcode.easy.p20_valid_parenthses;

public class Main {
    public static void main(String[] args) {
        String s = "([{}])";

        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }
}
