package com.xiaoxiao.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * 例如，给出 n = 3，生成结果为：
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 *
 * @author Xiaoyu
 * @date 2020/3/19 - 20:46
 * 思考:题目可以看出明显的递归过程,也就是f2 =(f1)或者()f1和f1()
 */
public class Solution {
    List<String> brackets = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n ==0) return brackets;

        dfs("",n,n,n);
        return brackets;
    }

    private void dfs(String s, int left, int right, int n) {
        if(left ==0&&right ==0) {
            brackets.add(s);
            return;
        }

        //不能以"("开头
        if(left>right) {
            return;
        }

        if(left>0) {
            dfs(s+"(",left-1,right,n);
        }

        if(right>0) {
            dfs(s+")",left, right -1,n);
        }
    }

}
