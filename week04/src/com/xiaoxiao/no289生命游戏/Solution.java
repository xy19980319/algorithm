package com.xiaoxiao.no289生命游戏;

import java.util.Arrays;

/**
 * 根据 百度百科 ，生命游戏，简称为生命，是英国数学家约翰·何顿·康威在 1970 年发明的细胞自动机。
 * 给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞都具有一个初始状态：1 即为活细胞（live），或 0 即为死细胞（dead）。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：
 * 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
 * 如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
 * 如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
 * 如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
 * 根据当前状态，写一个函数来计算面板上所有细胞的下一个（一次更新后的）状态。下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。
 * <p>
 * 示例：
 * 输入：
 * [
 *   [0,1,0],
 *   [0,0,1],
 *   [1,1,1],
 *   [0,0,0]
 * ]
 * 输出：
 * [
 *   [0,0,0],
 *   [1,0,1],
 *   [0,1,1],
 *   [0,1,0]
 * ]
 *  
 * 进阶：
 * <p>
 * 你可以使用原地算法解决本题吗？请注意，面板上所有格子需要同时被更新：你不能先更新某些格子，然后使用它们的更新后的值再更新其他格子。
 * 本题中，我们使用二维数组来表示面板。原则上，面板是无限的，但当活细胞侵占了面板边界时会造成问题。你将如何解决这些问题？
 *
 * @author Xiaoyu
 * @date 2020/4/2 - 22:25
 */
public class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;
        //新建一个数组和旧数组一样
        int[][] liveCells = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            liveCells[i] = Arrays.copyOf(board[i], board[i].length);
        }
        //对每个位置进行遍历,统计每个细胞周围的活细胞数量
        for (int i = 0; i < liveCells.length; i++) {
            for (int j = 0; j < liveCells[0].length; j++) {
                int count = 0;//统计位置上周围的活细胞数量
                count += (i - 1 >= 0 && j - 1 >= 0) && liveCells[i - 1][j - 1] == 1 ? 1 : 0;//左上
                count += i - 1 >= 0 && liveCells[i - 1][j] == 1 ? 1 : 0;//上
                count += (i - 1 >= 0 && j + 1 < liveCells[0].length) && liveCells[i - 1][j + 1] == 1 ? 1 : 0;//右上 //有问题
                count += j - 1 >= 0 && liveCells[i][j - 1] == 1 ? 1 : 0;//左
                count += j + 1 < liveCells[0].length && liveCells[i][j + 1] == 1 ? 1 : 0;//右
                count += (i + 1 < liveCells.length && j - 1 >= 0) && liveCells[i + 1][j - 1] == 1 ? 1 : 0;//左下
                count += (i + 1 < liveCells.length) && liveCells[i + 1][j] == 1 ? 1 : 0;//下
                count += (i + 1 < liveCells.length && j + 1 < liveCells[0].length) && liveCells[i + 1][j + 1] == 1 ? 1 : 0;//右下


                //如果该位置是死细胞
                if (liveCells[i][j] == 0) {
                    if (count == 3) board[i][j] = 1;
                }
                //如果该位置是活细胞
                if (liveCells[i][j] == 1) {
                    if (count < 2) board[i][j] = 0;
                    else if (count > 3) board[i][j] = 0;
                    else continue;
                }
            }
        }
    }

}
