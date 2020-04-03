package com.xiaoxiao.no74搜索二维矩阵;

import java.util.Arrays;

/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 示例 1:
 * 输入:
 * matrix = [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:
 * matrix = [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 13
 * 输出: false
 *
 * @author Xiaoyu
 * @date 2020/3/31 - 23:20
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;
        //首先搜索每列的第一个数,二分查找
        int begin = 0;
        int mid = 0;
        int end = matrix.length - 1;
        while (begin < end) {
            mid = (begin + end) / 2;
            //如果找到
            if (matrix[mid][0] == target) return true;
            else if (matrix[mid][0] > target) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        //找到的位置是begin+1;
        int row = begin;
        if(matrix[row][0] >target) row = row -1;
        //if(matrix[row][0] <=target)row = row +1;
        System.out.println(row);
        int i = Arrays.binarySearch(matrix[row], target);
        return i >= 0;

    }
}
