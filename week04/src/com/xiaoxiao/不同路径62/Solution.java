package com.xiaoxiao.不同路径62;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 * <p>
 * 机器人只能向两边移动,那么机器人的下一步加上两侧的路劲的和就是他的路径数量
 *
 * @author Xiaoyu
 * @date 2020/3/31 - 11:28
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        //首先建立一个二维数组
        int[][] route = new int[n][m];
        //初始化圆点,两边的极限
        route[0][0] = 0;
        int rowEnd = n - 1;//行边界
        int colEnd = m - 1;//列边界
        //计算棋盘中的路劲数量,其中两边的都为1
        for (int i = 0; i <= rowEnd; i++) {
            for (int j = 0; j <= colEnd; j++) {
                //初始化上边和左边
                if (i == 0 || j == 0) {
                    route[i][j] =1;
                    continue;
                }
                route[i][j] = route[i][j-1]+route[i-1][j];
            }
        }
        return route[rowEnd][colEnd];
    }
}
