package com.xiaoxiao.combinationSum2;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * 说明：
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * 示例 2:
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 *
 * @author Xiaoyu
 * @date 2020/3/22 - 18:11
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) return lists;
        Arrays.sort(candidates); //排序
        List<Integer> list = new ArrayList<>();
        dfs(list, candidates, target, 0);
        return lists;

    }

    private void dfs(List<Integer> list, int[] nums, int target, int i) {
        if (target == 0) {
            lists.add(list);
            return;
        }
        if (target < 0) return;
        //为了重复数字参与加法,但是不重复执行,在循环的时候要排除他的兄弟结点,而且不能和他的父节点比,是循环后的结点与之前的比,所以Index不能为进去循环的结点
        for (int index = i; index < nums.length && nums[index] <= target; index++) {
            if (index > 0 && nums[index - 1] == nums[index]&&index!=i) continue;
            List<Integer> newList = new ArrayList<>(list);//拷贝旧的数组,以免影响递归
            newList.add(nums[index]);
            dfs(newList, nums, target - nums[index], index+1);

        }

    }
}
