package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: mysql1
 * @description: 检测是否为有效的括号
 * @author: Mr.Jiang
 * @create: 2019-10-10 22:53
 **/
public class ValidBrakets {
    public static void main(String[] args) {
        String s="{{{((()))}}}";
        ValidBraketsSolution vbs=new ValidBraketsSolution();
        Boolean boolean1=vbs.isValid(s);
        System.out.println(boolean1);
    }
}


class ValidBraketsSolution {
    Map<Character, Character> mapping = new HashMap<>();

    public ValidBraketsSolution() {
        this.mapping.put(')', '(');
        this.mapping.put(']', '[');
        this.mapping.put('}', '{');
    }

    public Boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            if (this.mapping.containsKey(l)) {
                char element = stack.isEmpty() ? '#' : stack.pop();
                if (this.mapping.get(l) != element) {
                    return false;
                }
            } else {
                stack.push(l);
            }
        }
        return stack.isEmpty();
    }
}

    