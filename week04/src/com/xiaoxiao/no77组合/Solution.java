package com.xiaoxiao.no77组合;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 *
 * @author Xiaoyu
 * @date 2020/4/1 - 13:38
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
       // for (int i = 1; i <= n; i++) {
            dfs(list,1,n,k);
       // }
        return lists;
    }

    private void dfs(List<Integer> list, int i, int n, int k) {
        if(k==0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int j =i ; j <= n; j++) {
            list.add(j); //将数字加入数组中
            dfs(list,j+1,n,k-1);
            list.remove(list.size() -1);//回溯

        }
    }
}
