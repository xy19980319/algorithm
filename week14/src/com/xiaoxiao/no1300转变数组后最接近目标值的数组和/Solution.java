package com.xiaoxiao.no1300转变数组后最接近目标值的数组和;

import java.util.Arrays;

/**
 * @author Xiaoyu
 * @date 2020/6/14 - 9:17
 */
public class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        if (sum <= target) return arr[len - 1];
        if (target / len <= arr[0]) {
            double value = (double) target / len;
            double v = value - Math.floor(value);
            return v <= 0.5 ? (int) Math.floor(value) : (int) Math.ceil(value);
        }
        int minDiff = Integer.MAX_VALUE;
        int minTemp = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            int newLen = len - i;//新区间的长度
            int temp = 0;//每个值
            double value = (double) target / newLen;
            double v = value - Math.floor(value);
            temp = v <= 0.5 ? (int) Math.floor(value) : (int) Math.ceil(value);
            if(minTemp!=Integer.MAX_VALUE&&temp<minTemp) break;
            int diff = temp >= arr[i] ? target - arr[i] - temp * (newLen - 1) : target - temp * newLen;
            if (diff == 0) return temp;
            //接近target
            if (diff < minDiff) {
                minDiff = diff;
                minTemp = temp;
            }
            target -= arr[i];
        }
        return minTemp;
    }
}
