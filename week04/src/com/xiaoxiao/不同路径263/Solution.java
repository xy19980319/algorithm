package com.xiaoxiao.不同路径263;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 * @author Xiaoyu
 * @date 2020/3/31 - 11:49
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //如果出口是障碍物,直接返回0
        if (obstacleGrid[0][0] == 1 || obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) return 0;
        int[][] routine = new int[obstacleGrid.length][obstacleGrid[0].length];//首先新建一个二维数组等于障碍数组的大小
        //开始遍历数组,如果有障碍物则将障碍物变为0
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (i == 0 || j == 0) {
                    if (i == 0 && obstacleGrid[i][j] == 1) break;
                    if (obstacleGrid[i][j] == 1) {
                        int add = i;
                        while (add < obstacleGrid.length) {
                            obstacleGrid[add++][j] = 1;
                        }
                        continue;
                    }
                    routine[i][j] = 1;
                    continue;
                }
                //如果遇见障碍物,那么把他变为0
                if (obstacleGrid[i][j] == 1) {
                    routine[i][j] = 0;
                    continue;
                }
                routine[i][j] = routine[i - 1][j] + routine[i][j - 1];//为上面和左边的条数相加
            }
        }
        return routine[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
