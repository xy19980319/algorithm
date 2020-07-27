package com.xiaoxiao.doubleweek.no3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**5423. 找两个和为目标值且不重叠的子数组  显示英文描述
 给你一个整数数组 arr 和一个整数值 target 。
 请你在 arr 中找 两个互不重叠的子数组 且它们的和都等于 target 。可能会有多种方案，请你返回满足要求的两个子数组长度和的 最小值 。
 请返回满足要求的最小长度和，如果无法找到这样的两个子数组，请返回 -1 。
 * @author Xiaoyu
 * @date 2020/6/13 - 22:10
 */
public class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a+=arr[i];
        }
        System.out.println(a);
        return 0;
    }
    public int minSumOfLengths1(int[] arr, int target) {
        List<Integer> nums = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i];
            if(sum>target) continue;
            if(sum == target) {
                nums.add(1);
                continue;
            }
            for (int j = i-1; j >=0; j--) {
                sum+=arr[j];
                if(sum>target) break;
                if(sum == target) {
                    int len = i-j+1;
                    if(i-j<2) i=j;
                    else{
                        for (int k = i-2; k >=j ; k--) {
                            int tempSum = 0;
                            for (int m = 0; m < len-1; m++) {
                                if(k-m<0) break;
                                tempSum += arr[k-m];
                                if(tempSum >target) continue;
                                if(tempSum == target&&(m+1<len)) {
                                    len = m+1;
                                    i=k-m;
                                    break;
                                }
                            }
                        }
                    }
                    nums.add(len);
                    break;
                }
            }
        }
        if(nums.size()<2) return -1;
        nums.sort(Comparator.comparingInt(o -> o));
        return nums.get(0)+nums.get(1);
    }
}
