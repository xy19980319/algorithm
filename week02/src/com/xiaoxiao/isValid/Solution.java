package com.xiaoxiao.isValid;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * @author Xiaoyu
 * @date 2020/3/18 - 22:11
 */
public class Solution {
    LinkedList<Character> brackets = new LinkedList<>();

    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        //用一个栈来存放字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //遇到左括号,将括号放入沾
            if (c == '(' || c == '[' || c == '{') {
                brackets.push(c);

            } else {
                //判断栈是否为空,为空则直接返回false
                if (brackets.isEmpty()) {
                    return false;
                }
                //弹栈
                char outc = brackets.pop();
                //判断弹出是否与输入是配对,不配对直接返回false;
                if(outc == '(' && c != ')'||outc == '[' && c != ']'||outc == '{' && c != '}')
                    return false;
                /*if (outc == '(' && c != ')')
                    return false;
                if (outc == '[' && c != ']')
                    return false;
                if (outc == '{' && c != '}')
                    return false;*/
            }
        }
        return brackets.isEmpty();
    }

    public boolean isValid1(String s) {
        if (s.isEmpty()) {
            return false;
        }
        //数组0,1,2分别存放(,[,{的数量
        int[] countBrackets = new int[3];

        for (int i = 0; i < s.length(); i++) {
            //拿到遍历的每个字符
            char c = s.charAt(i);
            //开始对元素进行累加统计
            switch (c) {
                case '(':
                    countBrackets[0] += 1;
                    break;
                case '[':
                    countBrackets[1] += 1;
                    break;
                case '{':
                    countBrackets[2] += 1;
                    break;
                case ')':
                    countBrackets[0] -= 1;
                    if (countBrackets[0] < 0)
                        return false;
                    break;
                case ']':
                    countBrackets[1] -= 1;
                    if (countBrackets[1] < 0)
                        return false;
                    break;
                case '}':
                    countBrackets[2] -= 1;
                    if (countBrackets[2] < 0)
                        return false;
                    break;
            }
        }
        //检查是否有剩余
        return countBrackets[0] == 0 && countBrackets[1] == 0 && countBrackets[2] == 0;

    }
}
