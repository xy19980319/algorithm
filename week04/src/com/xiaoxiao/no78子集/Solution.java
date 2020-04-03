package com.xiaoxiao.no78子集;

import java.util.ArrayList;
import java.util.List;

/**
 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 说明：解集不能包含重复的子集。
 示例:

 输入: nums = [1,2,3]
 输出:
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 * @author Xiaoyu
 * @date 2020/4/1 - 14:28
 */
public class Solution {
    private List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        lists.add(new ArrayList<Integer>());//先把空的数组放入集合数组中
        //开始遍历数组,如果有新的数字就创造一个新的集合加入到大集合中,然后将集合的数字和之前的大集合的集合合在一起
        for (int i = 0; i < nums.length; i++) {
            int size = lists.size();
            //lists.add(new ArrayList<>(nums[i]));//将数组的数字加入到数组中
            //循环大集合,将大集合和数组的数结合后加入大集合
            for (int j = 0; j < size; j++) {
                List<Integer> newlist = new ArrayList<Integer>(lists.get(j));//拿出一个集合
                newlist.add(nums[i]);
                lists.add(newlist);//变成新的集合加入进去
            }
        }
        return lists;
    }
}
