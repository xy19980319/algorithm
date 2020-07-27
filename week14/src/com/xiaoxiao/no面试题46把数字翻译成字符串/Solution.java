package com.xiaoxiao.no面试题46把数字翻译成字符串;

import java.util.Arrays;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Xiaoyu
 * @date 2020/6/9 - 8:22
 */
public class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int len = chars.length;
        int[] dp = new int[len + 1];
        dp[0] = 1;//第一个字符可以有一种方案
        dp[1] = 1;//第一个字符可以有一种方案
        for (int i = 2; i <= len; i++) {
            if (canCom(chars, i-1)) dp[i] = dp[i - 1] + dp[i - 2];
            else dp[i] = dp[i - 1];
        }
        return dp[len];
    }

    private boolean canCom(char[] chars, int i) {
        //可以合并前一个数的前提就是前一个数不为0切为1或者2,为2的时候当前数要在0-5之间
        if (chars[i - 1] == '1' ||(chars[i - 1] == '2' && (chars[i] >= '0' && chars[i] <= '5')))
            return true;
        else return false;
    }
}
