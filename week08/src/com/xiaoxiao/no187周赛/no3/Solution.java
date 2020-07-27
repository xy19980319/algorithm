package com.xiaoxiao.no187周赛.no3;

import java.util.Arrays;

/**绝对差不超过限制的最长连续子数组  显示英文描述
 给你一个整数数组 nums ，和一个表示限制的整数 limit，请你返回最长连续子数组的长度，该子数组中的任意两个元素之间的绝对差必须小于或者等于 limit 。
 如果不存在满足条件的子数组，则返回 0 。
 * @author Xiaoyu
 * @date 2020/5/3 - 10:26
 */
public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int maxLen = 0;
        int[][] min = new int[nums.length][nums.length];
        int[][] max = new int[nums.length][nums.length];
        min[0][0]=nums[0];
        max[0][0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < i; j++) {
                min[i][j] = Math.min(min[i][j-1],nums[i]);
                max[i][j] = Math.min(max[i][j-1],nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 0; j <= i; j++) {
                if(max[j][i] - min[j][i] <=limit) maxVal = Math.max(maxVal,i-j+1);
            }
            maxLen = Math.max(maxLen,maxVal);
        }
        return maxLen;
    }

}
