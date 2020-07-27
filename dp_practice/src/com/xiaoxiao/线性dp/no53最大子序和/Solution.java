package com.xiaoxiao.线性dp.no53最大子序和;

/**给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 示例:
 输入: [-2,1,-3,4,-1,2,1,-5,4],
 输出: 6
 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

 * @author Xiaoyu
 * @date 2020/5/6 - 22:04
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if(dp[i-1]>0)
            dp[i] = dp[i-1] + nums[i];
            else dp[i] = nums[i];
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
