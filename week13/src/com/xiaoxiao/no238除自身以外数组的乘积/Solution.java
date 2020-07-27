package com.xiaoxiao.no238除自身以外数组的乘积;

/**
 * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 示例:
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * <p>
 * 提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * 进阶：
 * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 *
 * @author Xiaoyu
 * @date 2020/6/4 - 20:12
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int dp1[] = new int[len + 1];
        int dp2[] = new int[len + 1];
        dp1[0] = 1;
        dp2[len] = 1;
        for (int i = 1; i < len; i++) {
            dp1[i] = dp1[i-1] * nums[i - 1];
        }
        for (int i = len - 1; i > 0; i--) {
            dp2[i] = dp2[i + 1] * nums[i];
        }
        int[] output = new int[len];
        for (int i = 0; i < output.length; i++) {
            output[i] = dp1[i] * dp2[i+1];
        }
        return output;
    }
    public int[] productExceptSelf1(int[] nums) {
        int len = nums.length;
        int dp[][] = new int[len + 1][len + 1];
        dp[0][0] = 1;
        dp[len][len] = 1;
        for (int i = 1; i < len; i++) {
            dp[0][i] = dp[0][i - 1] * nums[i - 1];
        }
        for (int i = len - 1; i > 0; i--) {
            dp[i][len] = dp[i + 1][len] * nums[i];
        }
        int[] output = new int[len];
        for (int i = 0; i < output.length; i++) {
            output[i] = dp[0][i] * dp[i+1][len];
        }
        return output;
    }
}
