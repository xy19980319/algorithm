package com.xiaoxiao.排序数组;

/**
 * 给你一个整数数组 nums，将该数组升序排列。
 * 示例 1：
 * 输入：nums = [5,2,3,1]
 * 输出：[1,2,3,5]
 * 示例 2：
 * 输入：nums = [5,1,1,2,0,0]
 * 输出：[0,0,1,1,2,5]
 *
 * @author Xiaoyu
 * @date 2020/3/31 - 10:51
 */
public class Solution {
    //考虑采用希尔排序
    public int[] sortArray(int[] nums) {
        //希尔排序首先确定分组的个数
        int h = 1;
        while (h > nums.length / 2) {
            h = 2 * h + 1;
        }

        //开始进行希尔排序
        while (h >= 1) {
            //选择插入对象为Nums[h]
            for (int i = h; i < nums.length; i++) {
                //排序对象为h的位置和减去对应分组的位置
                for (int j = i; j >= h; j -= h) {
                    if (bigger(nums[j-h], nums[j])) exch(nums, j, j - h);
                    else break;
                }

            }
            h /= 2;//希尔排序每次除以2个数
        }
        return nums;
    }

    private void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private boolean bigger(int num1, int num2) {
        return num1 - num2 > 0;
    }
}
