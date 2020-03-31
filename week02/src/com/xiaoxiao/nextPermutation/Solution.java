package com.xiaoxiao.nextPermutation;

import java.util.Arrays;

/**
 * @author Xiaoyu
 * @date 2020/3/21 - 14:19
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <=1) return ;

        int last = nums.length -1;
        //从后往前遍历
        while (last >0) {
            //找到一个23这样的数,也就是last-1 小于last
            if(nums[last-1]<nums[last]) {
                //对last-1位置的数进行交换,首先要查找到last及其后面的最小的比last-1位置的书
                int min = nums[last];
                int k = last;
                for (int i = last+1; i < nums.length; i++) {
                    if(nums[i]>nums[last-1]&&nums[i]<min) {
                        min = nums[i];
                        //改变最小位置的索引
                        k =i;
                    }
                }
                exch(nums,last-1,k);
                Arrays.sort(nums,last,nums.length);
                return;
            }
            last --;
        }
        Arrays.sort(nums);
    }

    private void exch(int[] nums, int i, int k) {
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k]=temp;
    }
}
