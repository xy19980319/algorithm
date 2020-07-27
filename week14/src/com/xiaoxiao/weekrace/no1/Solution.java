package com.xiaoxiao.weekrace.no1;

/**5436. 一维数组的动态和  显示英文描述
 通过的用户数 0
 尝试过的用户数 0
 用户总通过次数 0
 用户总提交次数 0
 题目难度 Easy
 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。

 请返回 nums 的动态和。
 * @author Xiaoyu
 * @date 2020/6/14 - 10:26
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i-1]+nums[i];
        }
        return  res;
    }
}
