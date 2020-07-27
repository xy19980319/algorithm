package com.xiaoxiao.no162寻找峰值;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 10:02
 */
public class Solution {
    int max = Integer.MIN_VALUE;
    int index = -1;

    public int findPeakElement(int[] nums) {
        //直接找最大值
        int start = 0;
        int end = nums.length - 1;
        //找到最大值
        find(nums, start, end);
        return index;
    }

    private void find(int[] nums, int start, int end) {
        if (end - start <= 1) {
            if (nums[start] > nums[end]) {
                index = nums[start] > max ? start : index;
            } else {
                index = nums[end] > max ? end : index;
            }
            return;
        }
        find(nums, start, start + (end - start) / 2);
        find(nums, start + (end - start) / 2, end);

    }

}
