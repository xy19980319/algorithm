package com.xiaoxiao.no150逆波兰表达式求值;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Xiaoyu
 * @date 2020/4/28 - 16:42
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        //创建一个栈,将数字放入栈,碰到运算符就出栈
        if (tokens == null || tokens.length == 0) return 0;
        Deque<Integer> stack = new ArrayDeque<>();//新建栈
        int num1;
        int num2;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 + num1);
                    break;
                case "-":
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 - num1);
                    break;
                case "*":
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 * num1);
                    break;
                case "/":
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 / num1);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
