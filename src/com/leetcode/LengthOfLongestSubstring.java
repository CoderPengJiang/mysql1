package com.leetcode;

import java.lang.Character;
import java.util.Set;
import java.util.HashSet;

//暴力方法
//public class LengthOfLongestSubstring {
//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        int ans = 0;
//        for (int i = 0; i < n; i++)
//            for (int j = i + 1; j <= n; j++)
//                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
//        return ans;
//    }
//
//    public boolean allUnique(String s, int start, int end) {
//        Set<Character> set = new HashSet<>();
//        for (int i = start; i < end; i++) {
//            Character ch = s.charAt(i);
//            if (set.contains(ch)) return false;
//            set.add(ch);
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        LengthOfLongestSubstring sL=new LengthOfLongestSubstring();
//        String s="ewrrrrrrtyuioop569rrrrtvvgfd234567890mnbvcx";
//        int a=sL.lengthOfLongestSubstring(s);
//        System.out.println(a);
//    }
//}

//滑动窗口方法

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "ewrrrrrrtyuioop569rrrrtvv8gfd2345689007890mnbvcx";
        LengthOfLongestSubstringDemo sL = new LengthOfLongestSubstringDemo();
        int length1 = sL.lengthOfLongestSubstring(s);
        System.out.println(length1);
    }
}

class LengthOfLongestSubstringDemo {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
}
