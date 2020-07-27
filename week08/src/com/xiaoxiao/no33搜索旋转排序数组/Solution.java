package com.xiaoxiao.no33搜索旋转排序数组;

import java.util.Arrays;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 示例 1:
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 * 示例 2:
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 *
 * @author Xiaoyu
 * @date 2020/4/27 - 11:21
 */
public class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return -1;
        return isFind(nums, 0, len - 1, target);
    }

    private int isFind(int[] nums, int start, int end, int target) {
        if (end - start < 2) {
            if (nums[end] == target) return end;
            if (nums[start] == target) return start;
            return -1;

        }

        //如果左边小于右边,说明有序
        if (nums[start] < nums[end]) {
            int index = Arrays.binarySearch(nums, start, end + 1, target);
            return index >= 0 ? index : -1;
        }
        int left = isFind(nums, start, start + (end - start + 1) / 2 - 1, target);
        int right = isFind(nums, start + (end - start + 1) / 2, end, target);
        if (left >= 0) return left;
        if (right >= 0) return right;
        return -1;
    }
    public int search1(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < nums[right]){
                if(nums[mid] < target && target <= nums[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
            else{
                if(nums[left] <= target && target < nums[mid])
                    right = mid-1;
                else
                    left = mid+1;
            }
        }
        return -1;
    }

}
