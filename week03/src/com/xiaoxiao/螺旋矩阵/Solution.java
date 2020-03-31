package com.xiaoxiao.螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * 示例 1:
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 示例 2:
 * <p>
 * 输入:
 * [
 * [1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * @author Xiaoyu
 * @date 2020/3/25 - 14:38
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int start = 0;//定义边界
        int endRow = matrix.length - 1;//定义下边界
        int endCol = matrix[0].length - 1;//定义右边界
        int end = Math.min(endRow, endCol);
        while (start <= end/* <= endRow  && start <= endCol*/) {
            int startRow = start;
            int startCol = start;
            //将第I行先加入
            while (startCol <= endCol) {
                list.add(matrix[startRow][startCol]);
                startCol++;
            }
            //加入i行endcol列
            startCol--;
            //startRow++;
            while (startRow < endRow) {
                startRow++;
                list.add(matrix[startRow][startCol]);
            }
            //加入endRow行endcol列
            //startRow--;
            if (start == end) break;
            //startCol--;
            while (startCol > start) {
                startCol--;
                list.add(matrix[startRow][startCol]);
            }
            //加入i行j列
            //startCol++;
            //startRow--;
            while (startRow > start+1) {
                startRow--;
                list.add(matrix[startRow][startCol]);
            }
            start++;//下一个矩阵
            endRow--;
            endCol--;
            end --;
        }

        return list;

    }
}
