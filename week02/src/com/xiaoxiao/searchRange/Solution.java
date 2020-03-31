package com.xiaoxiao.searchRange;

import java.util.Arrays;

/**
 * @author Xiaoyu
 * @date 2020/3/21 - 16:35
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};
        if (nums.length == 0) return range;
        int i = Arrays.binarySearch(nums, target);
        if (i < 0) {
            return range;
        } else {
            int pre = i;
            int last = i;
            while (pre > 0 && nums[pre - 1] == nums[i]) pre--;
            while (last < nums.length - 1 && nums[last + 1] == nums[i]) last++;
            range[0] = pre;
            range[1] = last;
        }
        return range;
    }
}
