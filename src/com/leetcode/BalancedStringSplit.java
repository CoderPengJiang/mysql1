package com.leetcode;

import java.util.Stack;

/**
 * @program: mysql1
 * @description: 平衡分割字符串
 * @author: Mr.Jiang
 * @create: 2019-10-13 10:48
 **/
public class BalancedStringSplit {
    public static void main(String[] args) {
        String str="RLRRLLRLRL";
        BalancedStringSplit bs=new BalancedStringSplit();
        System.out.println(bs.balancedStringSplit(str));
    }
    
    /**
    * @Description: 查找字符串中平衡子字符串的最大数目
    * @Param: [s]
    * @return: int
    * @Author: Mr.Jiang
    * @Date: 2019/10/13
    */ 
    public int balancedStringSplit(String s) {
        int l=0;
        int r=0;
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='L'){
                l++;
            }else {
                r++;
            }

            if (l==r){
                count++;
                l=0;
                r=0;
            }
        }
        return count;
    }
}

    