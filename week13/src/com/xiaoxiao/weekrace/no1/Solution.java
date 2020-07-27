package com.xiaoxiao.weekrace.no1;

/**5428. 重新排列数组  显示英文描述
 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。

 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 * @author Xiaoyu
 * @date 2020/6/7 - 10:27
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] newA = new int[len];
        for (int i = 0; i < nums.length; i++) {
            if(i/n==0) newA[2*i]=nums[i];
            else {
                int j = i % n;
                newA[2*j+1] = nums[i];
            }
        }
        return newA;
    }
}
