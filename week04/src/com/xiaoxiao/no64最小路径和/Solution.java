package com.xiaoxiao.no64最小路径和;

import java.util.Arrays;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 * 示例:
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 * @author Xiaoyu
 * @date 2020/3/31 - 14:36
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length==0||grid[0].length==0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int[][] routine = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    routine[0][0] = grid[i][j];//初始化起点
                    continue;
                }
                //先对第一行第一列进行初始化
                if (i == 0 || j == 0) {
                    routine[i][j] = j > 0 ? grid[i][j] + routine[i][j - 1] : grid[i][j] + routine[i - 1][j];
                    continue;
                }
                routine[i][j] = Math.min(routine[i - 1][j], routine[i][j - 1]) + grid[i][j];
            }
        }
        return routine[row - 1][col - 1];
    }
}
