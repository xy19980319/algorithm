package com.xiaoxiao.背包dp.no494目标和;

/**
 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
 * <p>
 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums: [1, 1, 1, 1, 1], S: 3
 * 输出: 5
 * 解释:
 * <p>
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * <p>
 * 一共有5种方法让最终目标和为3。
 *
 * @author Xiaoyu
 * @date 2020/6/2 - 22:09
 */
public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(S>sum) return 0;
        //找到一个S(+) = (target + sum)/2的集合数
        if ((S + sum) % 2 != 0) return 0;//必须是偶数
        int target = (S + sum) / 2;
        int len = nums.length;
        int[] dp = new int[target+1];

        dp[0] = 1;

        for (int i = 1; i <= len; i++) {
          /*   for (int j = 0; j <= target; j++) {
                if(j - nums[i-1]<0) dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i - 1][j - nums[i-1]] + dp[i - 1][j];
            }*/
            for (int j = target; j >= nums[i-1]; j--) {
                dp[j] = dp[j - nums[i-1]] + dp[j];
            }
        }
        return dp[target];
    }
}
