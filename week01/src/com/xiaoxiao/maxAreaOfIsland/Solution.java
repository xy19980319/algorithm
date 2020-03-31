package com.xiaoxiao.maxAreaOfIsland;

/**
 * 给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。
 * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)
 * 示例 1:
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,1,1,0,1,0,0,0,0,0,0,0,0],
 * [0,1,0,0,1,1,0,0,1,0,1,0,0],
 * [0,1,0,0,1,1,0,0,1,1,1,0,0],
 * [0,0,0,0,0,0,0,0,0,0,1,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * 对于上面这个给定矩阵应返回 6。注意答案不应该是11，因为岛屿只能包含水平或垂直的四个方向的‘1’。
 * 示例 2:
 * [[0,0,0,0,0,0,0,0]]
 * 对于上面这个给定的矩阵, 返回 0。
 * 注意: 给定的矩阵grid 的长度和宽度都不超过 50。
 *
 * @author Xiaoyu
 * @date 2020/3/15 - 11:00
 */
public class Solution {
    //用dfs
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]==1) {
                    maxArea = Math.max(maxArea,dfs(grid,i,j));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        //当搜索出界或者搜索到值不为0的时候,直接跳出深度搜索
        if(i<0||i>=grid.length || j <0||j>=grid[i].length||grid[i][j] ==0) {
            return 0;
        }
        //搜索完要将搜索标机为已搜索,这里把搜索过的位置变为0即可
        grid[i][j] =0;
        int count = 1;
        //对位置进行上下左右深度搜索
        count+= dfs(grid,i+1,j);
        count+= dfs(grid,i-1,j);
        count+= dfs(grid,i,j+1);
        count+= dfs(grid,i,j-1);
        return count;
    }

    public int maxAreaOfIsland1(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int maxArea = 0;
        int count  = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (i == 0) {
                    dp[i][j] = grid[i][j];
                    continue;
                }
                if (grid[i][j] == 1) {
                    if (j == grid[i].length - 1) {
                        dp[i][j] = 1 + dp[i - 1][j];
                    } else {
                        if (dp[i][j + 1] !=0 &&dp[i - 1][j]==0) {
                            dp[i][j]=dp[i][j + 1]+1;
                        }else if (dp[i][j + 1] ==0 &&dp[i - 1][j]!=0) {
                            dp[i][j]=dp[i - 1][j]+1;
                        }else if(dp[i][j + 1] ==0 &&dp[i - 1][j]==0){
                            dp[i][j] = 1;
                        }else if (dp[i][j + 1] !=0 &&dp[i - 1][j]!=0){

                            dp[i][j] = 1 + Math.max(dp[i][j + 1] ,dp[i - 1][j]);
                        }
                    }
                    maxArea = Math.max(maxArea, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                    if (j<dp[i].length-1&&dp[i][j+1]!=0) {
                        int countj=j+1;
                        while (countj < grid[i].length - 1) {
                            //感觉没必要管上面了
                            if(dp[i-1][countj]!=0) {
                                dp[i-1][countj] =dp[i][countj];
                            }
                            if (dp[i][countj+1]!=0) {
                                dp[i][countj+1]=dp[i][countj];
                                countj++;
                            }else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        for (int v : dp[0]) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : dp[1]) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : dp[2]) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : dp[3]) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : dp[4]) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : dp[5]) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : dp[6]) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : dp[7]) {
            System.out.print(v + " ");
        }
        return maxArea;
    }
}
