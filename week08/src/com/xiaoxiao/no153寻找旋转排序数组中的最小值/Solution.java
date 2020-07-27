package com.xiaoxiao.no153寻找旋转排序数组中的最小值;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。
 * <p>
 * 你可以假设数组中不存在重复元素。
 * 示例 1:
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * 示例 2:
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 *
 * @author Xiaoyu
 * @date 2020/4/26 - 9:05
 */
public class Solution {
    public int findMin(int[] nums) {
        if (nums == null ||nums.length ==0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.min(findMin(nums, 0, nums.length / 2 - 1), findMin(nums, nums.length / 2, nums.length - 1));
    }

    public int findMin(int[] nums, int start, int end) {
        if (end - start <= 1) return Math.min(nums[end], nums[start]);
        while(start < end&&nums[start]==nums[start+1]){
            start++;
        }
        while(start < end&&nums[end]==nums[end-1]){
            end--;
        }
        //如果数组有序,则直接返回最小值
        if (nums[start] < nums[end]) return nums[start];
        //如果无序,返回有序部分与无序部分的最小值
        return Math.min(findMin(nums, start, start + (end - start + 1) / 2 - 1), findMin(nums, start + (end - start + 1) / 2, end));
    }
}
