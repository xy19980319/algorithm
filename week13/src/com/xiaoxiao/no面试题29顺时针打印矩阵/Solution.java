package com.xiaoxiao.no面试题29顺时针打印矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 * @author Xiaoyu
 * @date 2020/6/5 - 21:48
 */
public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return null;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] res = new int[row * col];
        int count = 0;//记录数组编号
        int start = 0;//定义边界
        int endRow = matrix.length - 1;//定义下边界
        int endCol = matrix[0].length - 1;//定义右边界
        int end = Math.min(endRow, endCol);
        while (start <= end/* <= endRow  && start <= endCol*/) {
            int startRow = start;
            int startCol = start;
            //将第I行先加入
            while (startCol <= endCol) {
                res[count++] = matrix[startRow][startCol];
                startCol++;
            }
            //加入i行endcol列
            startCol--;
            while (startRow < endRow) {
                startRow++;
                res[count++] = matrix[startRow][startCol];
            }
            //加入endRow行endcol列
            if (start == end) break;
            while (startCol > start) {
                startCol--;
                res[count++] = matrix[startRow][startCol];
            }
            //加入i行j列

            while (startRow > start + 1) {
                startRow--;
                res[count++] = matrix[startRow][startCol];
            }
            start++;//下一个矩阵
            endRow--;
            endCol--;
            end--;
        }

        return res;

    }
}
