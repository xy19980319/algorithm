package com.xiaoxiao.no227基本计算器2;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @author Xiaoyu
 * @date 2020/6/12 - 22:00
 */
public class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        char[] chars = s.toCharArray();
        LinkedList list = new LinkedList();
        int last = 0;//把最后一个数先拿出来
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            //如果不是操作符
            if (!isOperation(chars, i)) {
                if(list.isEmpty()|| Objects.equals(list.getLast(),'+') ||Objects.equals(list.getLast(),'-')) last = 0;
                else last = (int) list.removeLast();
                list.add(last * 10 + (int) (chars[i] - '0'));
            } else {
                if (chars[i] == '+') {
                    list.add('+');
                } else if (chars[i] == '-') {
                    list.add('-');
                } else if (chars[i] == '*') {
                    last = (int) list.removeLast();
                    int op2 = 0;
                    while (!isOperation(chars, ++i)) {
                        char tempOp = chars[i];
                        if(tempOp==' ') continue;
                        else op2 = op2*10 + (int) (chars[i] - '0');
                    }
                    i--;
                    temp = last * op2;
                    list.add(temp);
                }else if (chars[i] == '/') {
                    last = (int) list.removeLast();
                    int op2 = 0;
                    while (!isOperation(chars, ++i)) {
                        char tempOp = chars[i];
                        if(tempOp==' ') continue;
                        else op2 = op2*10 + (int) (chars[i] - '0');
                    }
                    i--;
                    temp = last / op2;
                    list.add(temp);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //如果是加号,不理
            if(Objects.equals(list.get(i),'+')) continue;
            //如果是减号,那把下一个数变成负数
            if(Objects.equals(list.get(i),'-')) {
                list.set(i+1,(int)list.get(i+1)*(-1));
                continue;
            }
            sum += (int)list.get(i);
        }
        return sum;
    }

    private boolean isOperation(char[] chars, int i) {
        if(i>=chars.length||chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/') return true;
        return false;
    }
}
