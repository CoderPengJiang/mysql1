package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution1 sl = new Solution1();
        int n = 5;
        System.out.println(sl.numPrimeArrangements(5));
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
    class Solution1 {
        public int numPrimeArrangements(int n) {
            int zhishuNum = 0;
            for (int i = 2; i <= n; i++) {
                if (n == 2 || n == 3) {
                    zhishuNum++;
                } else {
                    int a = (int) Math.sqr(i);
                    for (int j = 2; j <= a; j++) {
                        if (i % j != 0) {
                            zhishuNum++;
                        }
                    }
                }
            }
            int feizhiNum = n - zhishuNum;
            int feiHe = 1;
            int zhiHe = 1;
            for (int w = 1; w <= feizhiNum; w++) {
                feiHe = feiHe * w;
            }
            for (int h = 1; h <= zhishuNum; h++) {
                zhiHe = feiHe * h;
            }
            return feiHe * zhiHe % (10 ^ 9 + 7);
        }
    }
}