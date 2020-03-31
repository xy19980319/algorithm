package com.xiaoxiao.findmedian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * @author Xiaoyu
 * @date 2020/3/7 - 21:14
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2,3,4};
        int[] nums2 = {1,2,3,4};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //创建一个数组去存放新的数组
        List<Integer> list = new ArrayList<>();
        //创建一个长数组和短数组
        int[] longer;
        int[] shorter;
        if (nums1.length >= nums2.length) {
            longer = Arrays.copyOf(nums1, nums1.length);
            shorter = Arrays.copyOf(nums2, nums2.length);
        } else {
            longer = Arrays.copyOf(nums2, nums2.length);
            shorter = Arrays.copyOf(nums1, nums1.length);
        }
        int m = shorter.length;//短的放入m
        int n = longer.length;//长的放入n

        int p = 0;
        for (int i = 0; i < n; i++) {
            if (p > m - 1) {
                //将剩下的数组多余元素全部加入
                list.add(longer[i]);

            } else {
                if (longer[i] < shorter[p]) {
                    list.add(longer[i]);

                } else {
                    list.add(shorter[p]);
                    i--;
                    p++;
                }
            }
        }
        if (p < m) {
            int[] sRetain = Arrays.copyOfRange(shorter, p, m);
            for (int i : sRetain) {
                list.add (i);
            }




        }
        int size = list.size();
        System.out.println(size);
        System.out.println(list);
        Integer[] newArray = list.toArray(new Integer[size]);

        if (size % 2 == 0) {
            double a1 = newArray[size / 2 - 1];
            double a2 = newArray[size / 2];
            System.out.println("是奇数" + (a1 + a2) / 2);
            return (a1 + a2) / 2;
        } else {
            System.out.println("是奇数" + (double) newArray[size / 2]);
            return (double) newArray[size / 2];
        }

    }
}
