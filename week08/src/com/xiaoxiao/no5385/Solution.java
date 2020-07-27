package com.xiaoxiao.no5385;

import java.util.ArrayDeque;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给你一个整数 num 。你可以对它进行如下步骤恰好 两次 ：
 * 选择一个数字 x (0 <= x <= 9).
 * 选择另一个数字 y (0 <= y <= 9) 。数字 y 可以等于 x 。
 * 将 num 中所有出现 x 的数位都用 y 替换。
 * 得到的新的整数 不能 有前导 0 ，得到的新整数也 不能 是 0 。
 * 令两次对 num 的操作得到的结果分别为 a 和 b 。
 * <p>
 * 请你返回 a 和 b 的 最大差值 。
 *
 * @author Xiaoyu
 * @date 2020/5/2 - 22:43
 */
public class Solution {
    public int maxDiff(int num) {
        LinkedList<Integer> list = new LinkedList<>();
        while (num != 0) {
            list.push(num % 10);
            num /= 10;
        }
        StringBuilder max = new StringBuilder() ;
        StringBuilder min = new StringBuilder() ;
        int maxIndex = -1;
        int minIndex = -1;
        boolean isFirst = false;
        for (int i = 0; i < list.size(); i++) {
            int curr = list.get(i);
            if(maxIndex== -1&&curr!=9) {
                maxIndex = curr;
            }
            if(minIndex== -1&&curr!=0) {
                if(i==0&&curr!=1)  {
                    isFirst =true;
                    minIndex = curr;
                }else {
                    if(i!=0&&curr!=1)
                    minIndex = curr;
                }
            }
            if(maxIndex == curr) {
                max.append(9);
            }else {
                max.append(curr);
            }
            if(minIndex == curr) {
                if(isFirst) {
                    min.append(1);
                }else {
                    min.append(0);
                }
            }else {
                min.append(curr);
            }
        }
        return Integer.parseInt(max.toString())-Integer.parseInt(min.toString());
    }
}
