package com.xiaoxiao.线性dp.no152乘积最大子数组;

/**
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 * 注意到题目中有最大/连续子数组这样的字眼,所以考虑使用动态规划
 * 输入: [2,3,-2,4]
 输出: 6
 解释: 子数组 [2,3] 有最大乘积 6。
 输入: [-2,0,-1]
 输出: 0
 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 * @author Xiaoyu
 * @date 2020/5/9 - 15:34
 */
public class Solution {
    public int maxProduct(int[] nums) {
        //最大乘积最后有两个状态,一个是正数乘以正数,一个是负数成负数
        //思路可以是设置两个数组一个存放最大正数一个存放最大负数
        //然后进行比较
        if(nums == null || nums.length ==0) return 0;
        if(nums.length ==1) return nums[0];
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int[] maxDp = new int[nums.length+1];
        int[] minDp = new int[nums.length+1];
        maxDp[0] = 1;
        minDp[0] = 1;
        for (int i = 1; i <= len; i++) {
            int curr = nums[i-1];
            if(curr>=0) {
                maxDp[i] = Math.max(curr*maxDp[i-1],curr);
                minDp[i]= Math.min(curr*minDp[i-1],curr);
            }else {
                maxDp[i] = Math.max(curr*minDp[i-1],curr);
                minDp[i]= Math.min(curr*maxDp[i-1],curr);
            }
            max = Math.max(max,maxDp[i]);
        }
        return max;
    }
}
