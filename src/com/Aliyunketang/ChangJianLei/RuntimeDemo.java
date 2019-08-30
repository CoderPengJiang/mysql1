package com.Aliyunketang.ChangJianLei;

import java.lang.StringBuffer;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime ru = Runtime.getRuntime();
        System.out.println("【1】MAX_MEMORY" + ru.maxMemory());
        System.out.println("【1】TOTAL_MEMORY" + ru.totalMemory());
        System.out.println("【1】FREE_MEMORY" + ru.freeMemory());
        StringBuffer str = new StringBuffer(" ");
        for (int i = 0; i < 3000; i++) {
            str.append(i);
        }

        System.out.println("【2】MAX_MEMORY" + ru.maxMemory());
        System.out.println("【2】TOTAL_MEMORY" + ru.totalMemory());
        System.out.println("【2】FREE_MEMORY" + ru.freeMemory());
        ru.gc();
        System.out.println("【3】MAX_MEMORY" + ru.maxMemory());
        System.out.println("【3】TOTAL_MEMORY" + ru.totalMemory());
        System.out.println("【3】FREE_MEMORY" + ru.freeMemory());
    }
}