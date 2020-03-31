package com.xiaoxiao.isValidSudoku;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 * @author Xiaoyu
 * @date 2020/3/22 - 10:57
 */
public class Solution {
    static int[][] rows = new int[9][10];
    static int[][] column = new int[9][10];
    static int[][] matrix = new int[9][10];

    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][10];
        int[][] column = new int[9][10];
        int[][] matrix = new int[9][10];
        //遍历行
        for (int i = 0; i < board.length; i++) {
            //遍历列
            for (int j = 0; j < board[i].length; j++) {
                //如果是.则忽略
                if (board[i][j] == '.') continue;
                int curr = board[i][j] - '0';
                //看看行数组中是否存在 存在返回false
                if (rows[i][curr] == 0) rows[i][curr] = 1;
                else return false;
                if (column[j][curr] == 0) column[j][curr] = 1;
                else return false;

                int matrixNum = i / 3 * 3 + j / 3;
                if (matrix[matrixNum][curr] == 0) matrix[matrixNum][curr] = 1;
                else return false;
            }
        }
        return true;
    }
}
