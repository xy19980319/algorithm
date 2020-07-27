package com.xiaoxiao.weekrace.no1;

/**分割字符串的最大得分
 * 给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。
 * 「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。
 * 示例 1：
 *
 * 输入：s = "011101"
 * 输出：5
 * 解释：
 * 将字符串 s 划分为两个非空子字符串的可行方案有：
 * 左子字符串 = "0" 且 右子字符串 = "11101"，得分 = 1 + 4 = 5
 * 左子字符串 = "01" 且 右子字符串 = "1101"，得分 = 1 + 3 = 4
 * 左子字符串 = "011" 且 右子字符串 = "101"，得分 = 1 + 2 = 3
 * 左子字符串 = "0111" 且 右子字符串 = "01"，得分 = 1 + 1 = 2
 * 左子字符串 = "01110" 且 右子字符串 = "1"，得分 = 2 + 1 = 3
 * @author Xiaoyu
 * @date 2020/4/26 - 10:29
 */
public class Solution {
    public int maxScore(String s) {
        if(s == null || s.length() ==0) return 0;
        int len = s.length();
        int[] dp0= new int[len+1];
        int[] dp1= new int[len+1];
        dp0[0]=0;
        dp1[0]=0;
        for (int i = 1; i <= len; i++) {
            dp0[i]=s.charAt(i-1)=='0'?dp0[i-1]+1:dp0[i-1];
            dp1[i]=s.charAt(i-1)=='1'?dp1[i-1]+1:dp1[i-1];
        }
        int max = 0;
        for (int i = 1;i<len;i++) {
            max = Math.max(dp0[i]+dp1[len]-dp1[i],max);
        }
        return max;
    }
}
