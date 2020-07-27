package com.xiaoxiao.no187周赛.no2;

/**
 * @author Xiaoyu
 * @date 2020/5/3 - 10:26
 */
public class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int preindex = -1;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                preindex = index;
                index = i;
                if(preindex!=-1&&index-preindex-1<k) return false;
            }

        }
        return true;
    }
}
