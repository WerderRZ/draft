package leetcode.easy.p35_search_insert_position;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int middle = -1;
        int trend = 0;

        while (start <= end) {
            middle = start + (end - start) / 2;

            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
                trend = -1;
            } else {
                start = middle + 1;
                trend = 1;
            }
        }

        return (trend > 0 ? middle + 1 : middle);
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int result;

        result = s.searchInsert(new int[]{1,3,5,6}, 5);
        System.out.println(result);

        result = s.searchInsert(new int[]{1,3,5,6}, 2);
        System.out.println(result);

        result = s.searchInsert(new int[]{1,3,5,6}, 7);
        System.out.println(result);

        result = s.searchInsert(new int[]{1,3,5,6}, 0);
        System.out.println(result);


    }


}
