package com.xiaoxiao.no130被围绕的区域;

/**
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 * 示例:
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 运行你的函数后，矩阵变为：
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 *
 * @author Xiaoyu
 * @date 2020/4/10 - 20:42
 */
public class Solution {
    //把周围的O给隔离出来,把与之相连的O也隔离出来,其他的都能变成X
    public void solve(char[][] board) {
        if (board==null||board.length==0||(board.length <= 2&&board[0].length <=2)) return;
        int[][] assist = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                //如果处于边界,将边界的进行初始化
                if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1) {
                    //跳过四个顶点
                    if (i == 0 && j == 0 || i == 0 && j == board[0].length - 1 || i == board.length - 1 && j == board[0].length - 1 || i == board.length - 1 && j == 0)
                        continue;
                    if (board[i][j] == 'O') {
                        assist[i][j] = 1;//标记该位置是通的
                        if (i == 0) findConect(board, assist, 1, j);
                        else if (j == 0) findConect(board, assist, i, 1);
                        else if (i == board.length - 1) findConect(board, assist, board.length - 2, j);
                        else findConect(board, assist, i, board[0].length - 2);
                    }
                }
            }
        }
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[0].length - 1; j++) {
                if (board[i][j] == 'O') {
                    if(assist[i][j] == 1) continue;//如果相通,则跳过
                    board[i][j] = 'X';
                }
            }
        }
    }
    private void findConect(char[][] board, int[][] assist, int i, int j) {
        if(board[i][j] == 'X'||assist[i][j] == 1||i<1||i>=board.length-1||j<1||j>=board[0].length-1) return;
        assist[i][j] = 1;//将该位置标记为通路
        findConect(board,assist,i-1,j);//向上递归查询
        findConect(board,assist,i+1,j);//向下递归查询
        findConect(board,assist,i,j+1);//向右递归查询
        findConect(board,assist,i,j-1);//向左边递归查询
    }
    private void findConect1(char[][] board, int[][] assist, int i, int j) {
        if(board[i][j] == 'X') return;
        assist[i][j] = 1;
        //如果是第一行元素
        int up = i;
        int down = i;
        int left = j;
        int right = j;
        //向下遍历
        while (down <= board.length - 2) {
            if (assist[down+1][j] == 1) break;//已经遍历过
            if (board[down][j] == 'O') assist[down][j] = 1;
            else break;
            down++;
        }
        //向上便利
        while (up >= 1) {
            if (assist[up-1][j] == 1) break;//已经遍历过
            if (board[up][j] == 'O') assist[up][j] = 1;
            else break;
            up--;
        }
        //向左遍历
        while (left <= board[0].length - 2) {
            if (assist[i][left+1] == 1) break;//已经遍历过
            if (board[i][left] == 'O') assist[i][left] = 1;
            else break;
            left++;
        }
        //向上便利
        while (right >= 1) {
            if (assist[i][right-1] == 1) break;//已经遍历过
            if (board[i][right] == 'O') assist[i][right] = 1;
            else break;
            right--;
        }
    }
}
