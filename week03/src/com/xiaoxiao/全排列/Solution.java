package com.xiaoxiao.全排列;

import java.util.ArrayList;

import java.util.List;

/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 *
 * @author Xiaoyu
 * @date 2020/3/23 - 18:57
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0) return lists;
        for (int i = 0; i < nums.length; i++) {
            dfs(nums, list, nums.length);//深度遍历
        }
        return lists;
    }

    private void dfs(int[] nums, List<Integer> list, int i) {
        if (list.size() ==nums.length) {
            lists.add(list);
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if(list.contains(nums[j])) continue; //优化方案
            List<Integer> newList = new ArrayList<>(list);
            newList.add(nums[j]);
            dfs(nums,newList, i+1);
            //newList.remove(newList.size() -1);
        }

    }
}
