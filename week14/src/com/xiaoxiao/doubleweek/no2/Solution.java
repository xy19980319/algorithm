package com.xiaoxiao.doubleweek.no2;

import com.sun.org.apache.bcel.internal.generic.RET;

/**请你实现一个类 SubrectangleQueries ，它的构造函数中接收 rows x cols 的整数矩阵，并支持以下两种操作：
 1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
 用 newValue 更新以 (row1,col1) 为左上角且以 (row2,col2) 为右下角的子矩形。
 2. getValue(int row, int col)

 返回矩形中坐标为 (row,col) 当前的值。
 * @author Xiaoyu
 * @date 2020/6/13 - 22:10
 */
public class Solution {
    class SubrectangleQueries {
        private int[][] retangle;

        public SubrectangleQueries(int[][] rectangle) {
            this.retangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    retangle[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return retangle[row][col];
        }
    }

}
