package com.xiaoxiao.no209长度最小的子数组;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 * 示例: 
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 *
 * @author Xiaoyu
 * @date 2020/4/29 - 23:12
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int min = nums.length;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        //先将数组放入
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        if (sum[nums.length - 1] < s) return 0;
        for (int j = 0; j < sum.length; j++) {
            if (sum[j] >= s) {
                int minVal = j + 1;
                for (int i = j - 1; i >= 0; i--) {
                    //找到了这个位置的最短
                    if (sum[j] - sum[i] >= s) {
                        minVal = Math.min(minVal, j - i);
                        break;
                    }
                }
                min = Math.min(min, minVal);
            }
        }
        return min;
    }

    /**
     * 时间复杂度O(n) 双指针法
     *
     * @param s
     * @param nums
     * @return
     */
    public int minSubArrayLen1(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int sum = 0;
        int i = 0;
        int len = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            //找到大于的位置
            if (sum >= s) {
                len = len == 0 ? j - i + 1 : Math.min(len, j - i + 1);//记录滑动窗口长度
                sum-=nums[i];
                i++;
            }
        }
        return len;
    }
}
