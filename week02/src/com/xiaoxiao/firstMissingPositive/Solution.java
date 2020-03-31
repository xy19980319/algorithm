package com.xiaoxiao.firstMissingPositive;

import java.util.Arrays;

/**
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 * 示例 1:
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * 说明:
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。
 *
 * @author Xiaoyu
 * @date 2020/3/22 - 20:44
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) return 1;
        //遍历数组
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > nums.length) continue;//遇见负数,或者值超过长度的数直接忽略
            arr[nums[i] - 1] = nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) return i+1;//如果索引值和值不对应,那就是这个位置

        }
        return arr[arr.length - 1] + 1;
    }
}
