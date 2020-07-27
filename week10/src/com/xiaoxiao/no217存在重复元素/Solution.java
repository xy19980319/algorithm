package com.xiaoxiao.no217存在重复元素;
import	java.util.HashMap;

import java.util.HashMap;

/**给定一个整数数组，判断是否存在重复元素。
 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 示例 1:

 输入: [1,2,3,1]
 输出: true

 * @author Xiaoyu
 * @date 2020/5/17 - 10:07
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length <2) return false;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer> ();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])==null) {
                map.put(nums[i],1);
            }else {
                return true;
            }
        }
        return false;
    }
}
