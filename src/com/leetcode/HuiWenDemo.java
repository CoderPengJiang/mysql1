package com.leetcode;

public class HuiWenDemo {
    public static void main(String[] args) throws Exception {

        System.out.println();
    }
}

//class HuiWen {
//    public boolean huiWen(int x) {
//        if (x < 0) return false;
//        String str = String.valueOf(x);
//        StringBuffer s = new StringBuffer("");
//        s = s.append(x);
//        if (s.reverse().toString().equals(str)) {
//            return true;
//        } else
//            return false;
//    }
//
//}
//class HuiWen {
//    public boolean huiWenSolution(int x) {
//        boolean flag=false;
//        if (x < 0) return false;
//        int i = x;
//        int res = 0;
//        while (x != 0) {
//            int pop = x % 10;
//              x/=10;
//            res = res * 10 + pop;
//        }
//        if(res==i){
//            return true;
//        }else return false;
//
//    }
//}