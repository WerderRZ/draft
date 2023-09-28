package leetcode.easy.p169_majority_element;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

//        HashMap<Integer,Integer> map = new HashMap<>();
//        int halfNum = nums.length / 2;
//
//        for (int num: nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for (int key : map.keySet()) {
//            if (map.get(key) > halfNum) {
//                return key;
//            }
//        }
//
//        return 0;

        /*
        Arrays.sort(nums);

        int currentValue = nums[0];
        int maxValue = nums[0];
        int maxCount = 1;

        int count = 0;
        for (int num: nums) {
            if (num == currentValue) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = currentValue;
                }
                count = 1;
                currentValue = num;
            }
        }

        if (count > maxCount) {
            maxValue = currentValue;
        }


        return maxValue;
        */

        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        for (int value : nums) {

        }

        return 0;

    }
}
