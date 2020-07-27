package com.xiaoxiao.weekrace.no1;

import java.util.Arrays;

/**给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。

 请你计算并返回该式的最大值。
 * @author Xiaoyu
 * @date 2020/5/31 - 10:29
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int max = 0;
        max = Math.max((nums[0]-1)*(nums[1]-1),(nums[len -1]-1)*(nums[len -2]-1));
        return max;
    }
}
