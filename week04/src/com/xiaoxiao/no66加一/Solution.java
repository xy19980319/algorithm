package com.xiaoxiao.no66加一;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author Xiaoyu
 * @date 2020/3/31 - 15:51
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        //加一的正常情况就是在最后一位加一,但是如果超出范围,则进1
        if (digits[digits.length - 1] < 9) digits[digits.length - 1] += 1;//正常情况
        else {
            int curr = digits.length - 1;
            while (curr > 0 && digits[curr] == 9) {
                digits[curr] = 0;
                curr--;
            }
            //如果到了第0位还是9,那么就得变成10000
            if (digits[curr] == 9) {
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                return arr;
            }
            digits[curr] += 1;//将累加的位置+1
        }
        return digits;
    }
}
