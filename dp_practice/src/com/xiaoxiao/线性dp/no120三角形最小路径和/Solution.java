package com.xiaoxiao.线性dp.no120三角形最小路径和;

import java.util.List;

/**给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 例如，给定三角形：

 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 说明：

 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。

 * @author Xiaoyu
 * @date 2020/5/4 - 22:20
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() ==0) return 0;
        int n = triangle.size();
        int[] dp = new int[n];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            int size = triangle.get(i).size();
            for (int j = size-1; j >=0; j--) {
                if(j == 0) dp[j] = dp[j]+triangle.get(i).get(j);
                else if(j==size-1) dp[j] = dp[j-1]+triangle.get(i).get(j);
                else dp[j] = Math.min(dp[j-1],dp[j])+triangle.get(i).get(j);
            }
        }
        int res =Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.min(dp[i],res);
        }
        return res;
    }
}
