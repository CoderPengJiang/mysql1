package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: mysql1
 * @description: n组括号可以生产的最大种类数目
 * @author: Mr.Jiang
 * @create: 2019-10-13 16:06
 **/
public class GenerateParenthesis {
    List<String> ls = new ArrayList<>();

    public static void main(String[] args) {
        GenerateParenthesis gp = new GenerateParenthesis();
        System.out.println(Arrays.toString(gp.generateParenthesis(1).toArray()));
    }

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return ls;
        }
        solve(0, 0, n, "");
        return ls;
    }

    /**
     * @Description: 使用递归来计算生成括号的类型
     * @Param: [l, r, n, cur]
     * @return: void
     * @Author: Mr.Jiang
     * @Date: 2019/10/13
     */
    public void solve(int l, int r, int n, String cur) {
        if (l == n && r == n) {
            ls.add(cur.toString());
            return;
        }
        if (l < n) {
            solve(l + 1, r, n, cur + "(");
        }

        if (r < l) {
            solve(l, r + 1, n, cur + ")");
        }
    }
}

    