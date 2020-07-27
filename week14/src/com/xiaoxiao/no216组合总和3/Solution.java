package com.xiaoxiao.no216组合总和3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/6/8 - 23:38
 */
public class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        if(k==0||k>9) return res;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=(9-i);
        }
        if(sum<n) return res;
        List<Integer> temp = new ArrayList<>();
/*        boolean[] isUsed = new boolean[10];
        isUsed[0] = true;*/
        for (int i = 1; i <= 9; i++) {
            dfs(i,temp,n-i,k-1);
            temp.clear();
        }
        return res;

    }

    private void dfs(int curr, List<Integer> temp, int target, int nums) {
        temp.add(curr);
        if(nums==0&&target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if(nums<0||target<0) return;
        for (int i = curr+1; i <= 9; i++) {
            if(target<i) break;
            dfs(i,temp,target-i,nums-1);
            temp.remove(temp.size()-1);
        }
    }
}
