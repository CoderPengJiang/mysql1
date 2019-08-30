package com.leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = {1, 2, 3, 4, 6, 7, 9, 90, 100, 123, 200, 300, 400, 600, 100000, 999999};
        int target = 1000000;
        long startTime = System.nanoTime();
        Solution sl = new Solution();
        int[] DaAn = sl.towSum(arr, target);
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(DaAn) + "测试的时间为" + (endTime - startTime) + "ns");
    }
}
//
//class Solution {
//    public int[] towSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[]{i, map.get(complement)};
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//
//}
