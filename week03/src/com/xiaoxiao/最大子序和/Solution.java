package com.xiaoxiao.最大子序和;

/**
 * @author Xiaoyu
 * @date 2020/3/25 - 12:06
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) sum += nums[i];
            else sum = nums[i];
            max = Math.max(sum,max);

        }
        return max;
    }
}
