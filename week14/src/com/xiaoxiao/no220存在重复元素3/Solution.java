package com.xiaoxiao.no220存在重复元素3;

/**
 * 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。
 * 示例 1:
 * 输入: nums = [1,2,3,1], k = 3, t = 0
 * 输出: true
 * 示例 2:
 * 输入: nums = [1,0,1,1], k = 1, t = 2
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Xiaoyu
 * @date 2020/6/9 - 19:20
 */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        //找到一个长度为k的区间,将里面的的所有序列相减,如果有符合的,直接返回True
        if(k==0) return false;
        int start = 0;
        int end = start+k>nums.length ? nums.length-1 : start+k;
        int temp = 0;
        boolean isEnd = false;
        while (end < nums.length) {
            for (int right = start+1; right <= end; right++) {
                for (int left = start; left <right ; left++) {
                    temp = nums[right]-nums[left];
                    if(Math.abs(temp)<=t) return true;
                }
            }
            start = start + k;
            if(end+k>nums.length&&!isEnd) {
                end = nums.length-1 ;
                isEnd =true;
            }else end = end +k;

        }
        return false;
    }
}
