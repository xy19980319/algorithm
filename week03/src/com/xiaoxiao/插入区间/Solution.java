package com.xiaoxiao.插入区间;

import java.util.Arrays;

/**
 * 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * 示例 1:
 * 输入: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出: [[1,5],[6,9]]
 * 示例 2:
 * 输入: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * 输出: [[1,2],[3,10],[12,16]]
 * 解释: 这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
 *
 * @author Xiaoyu
 * @date 2020/3/25 - 22:56
 */
public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            int[][] arr = new int[1][2];
            arr[0] = newInterval;
            return arr;
        }
        //boolean hasOverlap = false;
        for (int i = 0; i < intervals.length; i++) {
            //找到重叠区
            if (newInterval[0] <= intervals[i][1]) {
               // hasOverlap = true;//标记找到位置
                //有三种情况,一种是左右无接触,二是左边插在区间左边但是右边在区间中间,三是插在区间里面,右边在后面
                //左右无接触
                if (newInterval[0] < intervals[i][0] && newInterval[1] < intervals[i][0]) {
                    int[][] newIntervals = Arrays.copyOf(intervals, intervals.length + 1);
                    //插入到第I个位置
                    for (int j = newIntervals.length - 2; j >= i; j--) {
                        newIntervals[j + 1] = newIntervals[j];
                    }
                    newIntervals[i] = newInterval;
                    return newIntervals;
                }
                //只需重叠一个
                /*if (newInterval[1] < intervals[i ][0]) {
                    intervals[i][0] = Math.min(intervals[i][0], newInterval[0]);
                    intervals[i][1] = Math.max(intervals[i][1], newInterval[1]);
                    return intervals;
                }*//*else if(newInterval[1] < intervals[i + 1][0]) {
                    intervals[i][0] = Math.min(intervals[i][0], newInterval[0]);
                    intervals[i][1] = Math.max(intervals[i][1], newInterval[1]);
                    return intervals;
                }*/
                //多个重叠
                else {
                    int count = 1;//重叠区间数
                    while (i+count<intervals.length&&intervals[i + count][0] <= newInterval[1]) { //超出最大范围的重叠区未写
                        count++;
                    }
                    //count++;

                    newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                    //if(count!=intervals.length-i)
                    newInterval[1] = Math.max(newInterval[1], intervals[i + count - 1][1]);
                    int[][] newIntervals = new int[intervals.length - count + 1][2];
                    for (int i1 = 0; i1 < i; i1++) {
                        newIntervals[i1] = intervals[i1];
                    }
                    newIntervals[i] = newInterval;
                    for (int i2 = i+count; i2 < intervals.length; i2++) {
                        newIntervals[++i] = intervals[i2];
                    }
                    return newIntervals;

                }
            }
        }
        //如果遍历完没有找到,直接返回新加入的集合在最后
            int[][] newIntervals = Arrays.copyOf(intervals, intervals.length + 1);
            newIntervals[newIntervals.length - 1] = newInterval;
            return newIntervals;
    }
}
