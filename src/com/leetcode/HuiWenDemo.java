package com.leetcode;

public class HuiWenDemo {
    public static void main(String[] args) throws Exception {
        HuiWen hw = new HuiWen();
        int x = 12321;
        System.out.println(hw.huiWen(x));
    }
}

class HuiWen {
    public boolean huiWen(int x) {
        if (x < 0) return false;
        String str = String.valueOf(x);
        StringBuffer s = new StringBuffer("");
        s = s.append(x);
        if (s.reverse().toString().equals(str)) {
            return true;
        } else
            return false;
    }

}