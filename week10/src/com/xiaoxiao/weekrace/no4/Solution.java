package com.xiaoxiao.weekrace.no4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 5415. 圆形靶内的最大飞镖数量  显示英文描述
 * 墙壁上挂着一个圆形的飞镖靶。现在请你蒙着眼睛向靶上投掷飞镖。
 * <p>
 * 投掷到墙上的飞镖用二维平面上的点坐标数组表示。飞镖靶的半径为 r 。
 * <p>
 * 请返回能够落在 任意 半径为 r 的圆形靶内或靶上的最大飞镖数。
 *
 * @author Xiaoyu
 * @date 2020/5/17 - 11:29
 */
public class Solution {
    public int numPoints(int[][] points, int r) {
        int num = 0;
        int len = points.length;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] * o1[0] + o1[1] * o1[1] - o2[0] * o2[0] + o2[1] * o2[1];
            }
        });
        for (int[] point : points) {
            for (int i : point) {
                System.out.println(i);
            }
        }
        int s = 2 * r * r;
        double[] nomarl = {0,0};
        if (len % 2 != 0) {
            nomarl[0] = points[len / 2][0];
            nomarl[1] = points[len / 2][1];
        }else {
            nomarl[0] = points[len / 2][0]+points[len / 2-1][0];
            nomarl[1] = points[len / 2][1]+points[len / 2-1][1];
        }
        for (int i = 0; i < len; i++) {
            if ((nomarl[1] - points[i][1]) * (nomarl[1] - points[i][1]) + (nomarl[0] - points[i][0]) * (nomarl[0] - points[i][0]) <= s)
                num++;
        }
        return num;
    }
}
