package com.xiaoxiao.全排列2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * 示例:
 * 输入: [1,1,2]
 * 输出:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 *
 * @author Xiaoyu
 * @date 2020/3/24 - 19:34
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 1) return lists;
        List<Integer> list = new ArrayList<>();
        int[] used = new int[nums.length];//用一个数组来标机是否使用过数据
        Arrays.sort(nums);
        dfs(list, used, nums);
        return lists;
    }

    private void dfs(List<Integer> list, int[] used, int[] nums) {
        //数组的数都放入集合中,将集合添加
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
          /*  for (int i = 0; i < nums.length; i++) {

            }*/
            return;
        }
        int lastUse = Integer.MAX_VALUE;
        //遍历Nums数组
        for (int i = 0; i < nums.length; i++) {
            //如果数组不含这个数,再执行之后的递归
            if (nums[i] != lastUse && used[i] == 0) {
                used[i] = 1;//标机已经使用过
                list.add(nums[i]);
                dfs(list, used, nums);//递归向下
                lastUse = nums[i];//更新使用过的
                used[i] = 0;//标记未用过
                list.remove(list.size() - 1);//回溯
            }

        }
    }
}
