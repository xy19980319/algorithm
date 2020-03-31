package com.xiaoxiao.车的可用捕获量;

/**在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 返回车能够在一次移动中捕获到的卒的数量。
 * @author Xiaoyu
 * @date 2020/3/26 - 11:37
 */
public class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;//记录能吃掉的小兵数量
        //首先遍历找到象的位置
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[i][j] =='R') {
                    //向左遍历找到小兵
                    for (int l = j-1; l > 0; l--) {
                        if (board[i][l]=='B') break;
                        if (board[i][l]=='p') {
                            count++;
                            break;
                        }
                    }
                    //向右边遍历找到小兵
                    for (int r = j+1; r < 8; r++) {
                        if (board[i][r]=='B') break;
                        if (board[i][r]=='p') {
                            count++;
                            break;
                        }
                    }
                    //向上遍历找到小兵
                    for (int u = i-1; u > 0; u--) {
                        if (board[u][j]=='B') break;
                        if (board[u][j]=='p') {
                            count++;
                            break;
                        }
                    }
                    //向下边遍历找到小兵
                    for (int d = i+1; d < 8; d++) {
                        if (board[d][j]=='B') break;
                        if (board[d][j]=='p') {
                            count++;
                            break;
                        }

                    }
                }
            }
        }
        return count;
    }
}
