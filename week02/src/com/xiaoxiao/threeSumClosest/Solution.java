package com.xiaoxiao.threeSumClosest;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.logging.Level;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * @author Xiaoyu
 * @date 2020/3/16 - 16:16
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }

        //首先对数组进行排序
        Arrays.sort(nums);
        //显然 如果目标值超出边界,直接取值最近的
        if (nums[0] >= target&&nums[0]>0) {
            return nums[0] + nums[1] + nums[2];
        }
        int targetSum;
        int twoSum;
        int max = Integer.MAX_VALUE;
        //遍历数组
        for (int v = 0; v < nums.length; v++) {
            targetSum = target - nums[v];
            //找最接近targetsum的两个数组的和
            int first = 0;
            int last = 0;
            if (v < nums.length - 1) {
                first = v + 1;
                last = nums.length - 1;
                if (first == last) {
                    break;
                }
            }


            int closer = Integer.MAX_VALUE;
            while (first < last) {
                twoSum = nums[first] + nums[last];
                if (closer == Integer.MAX_VALUE) {
                    closer =twoSum;
                } else {
                    closer = Math.abs(closer - targetSum) < Math.abs(twoSum - targetSum) ? closer : twoSum;
                }
                if (twoSum > targetSum) {
                    last--;
                } else {
                    first++;
                }
            }
            if (max == Integer.MAX_VALUE) {
                max = closer + nums[v];
            } else {
                max = Math.abs(max - target) <= Math.abs(closer + nums[v] - target) ? max : closer + nums[v];
            }
        }
        return max;
    }

    public int threeSumClosest1(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }
        //首先对数组进行排序
        Arrays.sort(nums);
        //显然 如果目标值超出边界,直接取值最近的

        int targetSum;
        int twoSum;
        int max = Integer.MAX_VALUE;
        //遍历数组
        for (int v = 0; v < nums.length; v++) {
            targetSum = target - nums[v];
            //找最接近targetsum的两个数组的和
            int first = 0;
            int last = 0;
            if (v < nums.length - 1) {
                first = v + 1;
                last = nums.length - 1;
                if (first == last) {
                    break;
                }
            }


            int closer = Integer.MAX_VALUE;
            while (first < last) {
                twoSum = nums[first] + nums[last];
                closer = Math.abs(closer - targetSum) < Math.abs(twoSum - targetSum) ? closer : twoSum;
                if (closer > targetSum) {
                    last--;
                } else {
                    first++;
                }
            }
            max = Math.abs(max - target) <= Math.abs(closer + nums[v] - target) ? max : closer + nums[v];

        }
        return max;
    }
}
