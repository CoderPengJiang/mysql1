package com.datastructure.tree;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] searchArr=new int[]{1,2,3,4,5,6,7,8,9,234};
        int searchValue=5;
        BinarySearchLei bs=new BinarySearchLei();
        int a=bs.binarysearcglei(searchArr,searchValue);
        System.out.println(a);
    }
}

class BinarySearchLei {
    public int binarysearcglei(int[] arr, int searchvalue) {
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        int searchIndex = 0;
        while (left <= right) {
            int midIndex = (left + right) / 2;
            int midValue = arr[midIndex];
            if (midValue > searchvalue) {
                right = midIndex - 1;
            } else if (midValue < searchvalue) {
                left = midIndex + 1;
            } else{
               return midIndex;
            }
        }
        return -1;
    }
}
