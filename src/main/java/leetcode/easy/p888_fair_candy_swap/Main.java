package leetcode.easy.p888_fair_candy_swap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1}, bobSizes = {2,2};

        Solution solution = new Solution();
        int[] result = solution.fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(result));
    }
}
