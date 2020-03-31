package com.xiaoxiao.combinationSum;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/22 - 14:57
 */
public class Solution {
    List<List<Integer>> combinations = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combination = new ArrayList<>();
        if (candidates.length == 0) return combinations;
        Arrays.sort(candidates);
        addcombi(combination, candidates, target, 0);
        return combinations;
    }

    private void addcombi(List<Integer> combination, int[] nums, int target, int num) {
        if (target == 0) {
            combinations.add(combination);
            return;
        }
        //if (target < nums[0]) return;
        for (int i = num; i < nums.length && nums[i] <= target; i++) {
            List<Integer> newCombination = new ArrayList<>(combination);//一定要将递归的数组拷贝过来.
            newCombination.add(nums[i]);//每次将数加入数组
            addcombi(newCombination, nums, target - nums[i], i);//计算下次的差值
        }
    }


}
