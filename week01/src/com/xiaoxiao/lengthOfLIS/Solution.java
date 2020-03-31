package com.xiaoxiao.lengthOfLIS;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 * 示例:
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * 说明:
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。
 * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 *
 * @author Xiaoyu
 * @date 2020/3/14 - 17:29
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        List<Integer> list = new ArrayList();
        int max = nums[0];
        int indexMax = 0;
        list.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                list.add(nums[i]);
                indexMax = list.size() - 1;
            } else {
                int count = 0;
                for (Integer in : list) {
                    if (in >= nums[i]) {
                        list.set(count, nums[i]);
                        if (count == indexMax) {
                            max = nums[i];
                        }
                        break;
                    }
                    count++;
                }
            }

        }
        return list.size();
    }

}
