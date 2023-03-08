package leetcode.p1;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        label:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break label;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] res = s.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(res));
    }


}
