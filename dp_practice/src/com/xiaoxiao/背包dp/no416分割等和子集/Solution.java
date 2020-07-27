package com.xiaoxiao.背包dp.no416分割等和子集;

/**
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * 注意:
 * 每个数组中的元素不会超过 100
 * 数组的大小不会超过 200
 * 示例 1:
 * <p>
 * 输入: [1, 5, 11, 5]
 * 输出: true
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 *
 * @author Xiaoyu
 * @date 2020/5/27 - 23:34
 */
public class Solution {
    public boolean canPartition1(int[] nums) {
        /**
         * f(i,j)表示数组前i个数中和为j
         * 1. 显然,如果能够成,那么那个时候的状态肯定只有两个,一个是他们使用f(i,j),选择i或者不选择i
         */
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) return false;
        boolean[] dp = new boolean[sum / 2 + 1];

        dp[0] = true;


        for (int i = 1; i <= len; i++) {
            for (int j = sum / 2; j >= nums[i - 1]; j--) {
                dp[j] = dp[j] || dp[j - nums[i - 1]];//等于不选i或者选i
            }
        }
        return dp[sum / 2];
    }

    public boolean canPartition(int[] nums) {
        /**
         * f(i,j)表示数组前i个数中和为j
         * 1. 显然,如果能够成,那么那个时候的状态肯定只有两个,一个是他们使用f(i,j),选择i或者不选择i
         */
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) return false;
        boolean[][] dp = new boolean[len + 1][sum / 2 + 1];
        for (int i = 1; i <= len; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j < sum / 2 + 1; j++) {
                if (j >= nums[i - 1])
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];//等于不选i或者选i
                else dp[j] = dp[j];
            }
        }
        return dp[len][sum / 2];
    }
}
