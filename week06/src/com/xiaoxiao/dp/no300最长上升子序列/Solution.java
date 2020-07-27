package com.xiaoxiao.dp.no300最长上升子序列;

/**
 * @author Xiaoyu
 * @date 2020/4/13 - 16:57
 */
public class Solution {
    public int lengthOfLIS(int[] nums){
        if(nums == null) return 0;
        if(nums.length<=1) return nums.length;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max =1;//默认最大值
        for (int i = 1; i < nums.length; i++) {
            int maxvalue = 0;
            //对值进行更新,如果这个值比前面的子序列其中一个值大,那么就可以加入到子序列中去
            for (int j = 0; j < i; j++) {
                if(nums[j]<nums[i]) {
                    maxvalue = Math.max(dp[j],maxvalue);
                }
            }
            dp[i]=maxvalue+1;
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
