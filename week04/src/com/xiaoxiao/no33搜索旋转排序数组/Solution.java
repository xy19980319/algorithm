package com.xiaoxiao.no33搜索旋转排序数组;

import java.util.Arrays;

/**假设按照升序排序的数组在预先未知的某个点上进行了旋转。

 ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

 你可以假设数组中不存在重复的元素。

 你的算法时间复杂度必须是 O(log n) 级别。

 示例 1:

 输入: nums = [4,5,6,7,0,1,2], target = 0
 输出: 4
 示例 2:

 输入: nums = [4,5,6,7,0,1,2], target = 3
 输出: -1

 * @author Xiaoyu
 * @date 2020/4/1 - 18:23
 */
public class Solution {
    public int search(int[] nums, int target) {
    //很明显,经过旋转后,数组一定能保证一半有序,一半无序,无序的又能有一半无序一半有序以此类推

        int first = 0;
        int last = nums.length -1;
        int mid = (first + last)/2;
        if(nums[mid]==target) return mid;
        if(first ==last) return -1;
        //分组为0,mid,mid+1,last
        //如果前半段有序
        if(isOrdered(nums,first,mid)) {
            //二分查找找到了索引的位置
            int index = binarySearch(nums,first,mid,target);
            if(index>0) return index;
            else search(Arrays.copyOfRange(nums,mid+1,last+1),target);
        }else {
            //后半段有序
            int index = binarySearch(nums,mid+1,last,target);
            if(index>0) return index;
            else search(Arrays.copyOfRange(nums,0,mid+1),target);
        }
        //没有找到
        return -1;
    }

    private int binarySearch(int[] nums, int first, int last,int target) {
        int mid ;
        while(first <last) {
            mid = (first+last)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) first = mid +1;
            else last = mid-1;
        }

        return -1;
    }

    private boolean isOrdered(int[] nums, int first, int last) {
        return nums[last]>nums[first];
    }
}
