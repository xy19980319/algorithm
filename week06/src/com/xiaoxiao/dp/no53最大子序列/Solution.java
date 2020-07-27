package com.xiaoxiao.dp.no53最大子序列;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * @author Xiaoyu
 * @date 2020/4/13 - 11:04
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int sum = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            sum = Math.max(sum + nums[i], nums[i]);
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
