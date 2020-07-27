package com.xiaoxiao.no166分数到小数;

/**
 * 给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以字符串形式返回小数。
 * 如果小数部分为循环小数，则将循环的部分括在括号内。
 * 示例 1:
 * 输入: numerator = 1, denominator = 2
 * 输出: "0.5"
 * 示例 2:
 * 输入: numerator = 2, denominator = 1
 * 输出: "2"
 * 示例 3:
 * 输入: numerator = 2, denominator = 3
 * 输出: "0.(6)"
 *
 * @author Xiaoyu
 * @date 2020/4/29 - 12:36
 */
public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        if(denominator == 0) return "NAN";
        StringBuilder newString = new StringBuilder();
        //整数部分是numerator/denominator
        newString.append(numerator / denominator);
        long remain = numerator % denominator;//余数
        if (remain == 0) return newString.toString();
        newString.append('.');
        long remainRes = 0;
        long newRemian = 0;//新的余数
        while (remain != 0) {
            remainRes = remain * 10 / denominator;
            newString.append(remainRes);
            newRemian = (remain * 10) % denominator;
            if (newRemian == remain) {
                newString.deleteCharAt(newString.length() - 1);
                newString.append('(').append(remainRes).append(')');
                return newString.toString();
            }
            remain = newRemian;
        }
        return newString.toString();

    }
}
