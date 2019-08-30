package com.leetcode;

class ReverseInt{
    public int ReverseInt(int x){
        int res=0;
        while (x!=0){
            int pop=x%10;
            x/=10;
            if(res>Integer.MAX_VALUE/10&&(res==Integer.MAX_VALUE/10||res>7)) return 0;
            if(res<Integer.MIN_VALUE/10&&(res==Integer.MIN_VALUE/10||res<-8)) return 0;
            res=res*10+pop;
        }
        return res;
    }
}

public class ReverseIntDemo {
    public static void main(String[] args)throws Exception{
        int s=10023;
        ReverseInt rev=new ReverseInt();
        int w=rev.ReverseInt(s);
        System.out.println("返回的结果为"+w);
    }
}
