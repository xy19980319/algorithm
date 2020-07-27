package com.xiaoxiao.no120三角形最小路径和;

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

 * @author Xiaoyu
 * @date 2020/4/9 - 11:32
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() ==0) return 0;
        /*
        * 求最小值,考虑使用动态规划
        * 1.创建一个和行数相同的一维数组
        * 2.数组每个位置保存每一行的最小值和对应的索引位置
        * */
        int dp[] = new int[triangle.size()+1];

        //从底部开始遍历
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j],dp[j+1]) + triangle.get(i).get(j);//这里的意思是上层会沿用原下层的结点,用的是与他相邻的两个结点的值,找出小的相加
            }
        }
        return dp[0];
    }
}
