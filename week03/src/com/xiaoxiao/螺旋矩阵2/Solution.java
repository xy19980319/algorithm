package com.xiaoxiao.螺旋矩阵2;

/**
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * 示例:
 * 输入: 3
 * 输出:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 *
 * @author Xiaoyu
 * @date 2020/3/26 - 14:34
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];//新建一个矩阵
        int start = 0;//定义开头
        int end = n - 1;//定义边界
        int sum = 1;
        while (start <= end/* <= endRow  && start <= endCol*/) {
            int startRow = start;
            int startCol = start;
            //将第I行先加入
            while (startCol <= end && sum <= n * n) {
                matrix[startRow][startCol] = sum++;
                startCol++;
            }
            //加入i行endcol列
            startCol--;
            while (startRow < end) {
                startRow++;
                matrix[startRow][startCol] = sum++;
            }
            //加入endRow行endcol列
            //startRow--;
            if (start == end) break;
            //startCol--;
            while (startCol > start) {
                startCol--;
                matrix[startRow][startCol] = sum++;
            }
            //加入i行j列
            //startCol++;
            //startRow--;
            while (startRow > start + 1) {
                startRow--;
                matrix[startRow][startCol] = sum++;
            }
            start++;//下一个矩阵
            end--;
        }
        return matrix;
    }
}
