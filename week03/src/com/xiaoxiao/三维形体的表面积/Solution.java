package com.xiaoxiao.三维形体的表面积;

/**
 * @author Xiaoyu
 * @date 2020/3/25 - 0:48
 */
public class Solution {
    public int surfaceArea(int[][] grid) {
        int N = grid.length;
        int surface = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                surface += grid[i][j] > 0 ? 2 : 0;//如果有矩形,那么先加上下底面积
                surface += j - 1 >= 0 ? Math.max(grid[i][j] - grid[i][j - 1], 0) : grid[i][j];//如果左边有,那么看有没有挡住,挡住返回0,否则返回后面减去前面
                surface += j + 1 < N ? Math.max(grid[i][j] - grid[i][j + 1], 0) : grid[i][j];//如果右边有,那么看有没有挡住,挡住返回0,否则返回后面减去前面
                surface += i + 1 < N ? Math.max(grid[i][j] - grid[i+1][j], 0) : grid[i][j];//如果前边有,那么看有没有挡住,挡住返回0,否则返回后面减去前面
                surface += i - 1 >= 0 ? Math.max(grid[i][j] - grid[i-1][j], 0) : grid[i][j];//如果后面边有,那么看有没有挡住,挡住返回0,否则返回后面减去前面
            }
        }
        return surface;
    }
}
