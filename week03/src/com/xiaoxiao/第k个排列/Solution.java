package com.xiaoxiao.第k个排列;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * <p>
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * <p>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 * 说明：
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 * 示例 1:
 * 输入: n = 3, k = 3
 * 输出: "213"
 * 示例 2:
 * 输入: n = 4, k = 9
 * 输出: "2314"
 *
 * @author Xiaoyu
 * @date 2020/3/26 - 15:41
 */
public class Solution {
    public String getPermutation(int n, int k) {
        if(n==0||k==0) return "";
        //一个数是n!,可以考虑一个数字一个数字的找出所有的字符
        List<Integer> nums = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) nums.add(i);//先加入数组
        appendNum(nums, sb, n, k);
        sb.append(nums.get(0));//将最后一个加入
        return sb.toString();
    }

    private void appendNum(List<Integer> nums, StringBuilder sb, int n, int k) {
        if (n-1==0) return;
        int cur = recur(n - 1);
        int i = k / cur;//得到序列
        int j = k % cur;//得到下轮的余数
        if(j==0)  i = i-1>=0?i-1:nums.size()-1;
        sb.append(nums.remove(i));
        appendNum(nums, sb, n - 1, k % cur);
    }

    public int recur(int number) {
        if (number != 0) {
            return number * recur(number - 1);
        } else return 1;
    }
}
