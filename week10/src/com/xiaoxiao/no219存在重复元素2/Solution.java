package com.xiaoxiao.no219存在重复元素2;

import java.util.HashMap;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 *
 * @author Xiaoyu
 * @date 2020/5/17 - 10:14
 */
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2) return false;
        if (k > nums.length) return false;
        boolean isSame = false;//是否是重复数组
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], i);
                isSame = true;
            } else {
                if (i - map.get(nums[i]) > k) {
                    map.put(nums[i], i);
                }else return true;
            }
        }
        if(!isSame) return false;
        return false;
    }
}
