package com.xiaoxiao.面试题13机器人的运动范围;

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，
 * 因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * 示例 1：
 * <p>
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 示例 1：
 * <p>
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 *
 * @author Xiaoyu
 * @date 2020/4/8 - 10:16
 */
public class Solution {
    public int movingCount(int m, int n, int k) {
        if (k == 0) return 1;
        int count = 1;//计数
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                if (sum(i) + sum(j) <= k) {
                    dp[i][j] = (i - 1 >= 0 && dp[i - 1][j] != 0) || (j - 1 >= 0 && dp[i][j - 1] != 0) ? ++count : 0;

                }
            }
        }
        return count;
    }

    public int sum(int i) {
        if(i>=0&&i<=9) return i;
        return i%10+sum(i/10);
    }
}
