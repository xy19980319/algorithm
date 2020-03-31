package com.xiaoxiao.合并区间;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Xiaoyu
 * @date 2020/3/25 - 19:36
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt((int[] i) -> i[0]));//对传入二维数组根据数组第一位进行升序排序
        int[][] newIntervals = new int[intervals.length][2];
        int[] interval = intervals[0];
        boolean isMerge = false;//记录是否合并
        int count = 0;//记录区间数
        for (int i = 0; i < intervals.length; i++) {
            if (!isMerge) interval = intervals[i];
            //如果该区间的小于等于后一个的小,那么合并区间
            if (i < intervals.length - 1 && interval[1] >= intervals[i + 1][0]) {
                interval[1] = Math.max(intervals[i + 1][1],interval[1]);
                isMerge = true;
                continue;
            }
            newIntervals[count++] = interval;//如果不需要合并,那么把区间放入
            isMerge = false;//重新计数
        }
        return Arrays.copyOfRange(newIntervals, 0, count);
    }
}
