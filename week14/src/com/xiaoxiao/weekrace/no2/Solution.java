package com.xiaoxiao.weekrace.no2;

import java.util.Collection;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 5437. 不同整数的最少数目  显示英文描述
 * 给你一个整数数组 arr 和一个整数 k 。现需要从数组中恰好移除 k 个元素，请找出移除后数组中不同整数的最少数目。
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [5,5,4], k = 1
 * 输出：1
 * 解释：移除 1 个 4 ，数组中只剩下 5 一种整数。
 * 示例 2：
 * <p>
 * 输入：arr = [4,3,1,1,3,3,2], k = 3
 * 输出：2
 * 解释：先移除 4、2 ，然后再移除两个 1 中的任意 1 个或者三个 3 中的任意 1 个，最后剩下 1 和 3 两种整数。
 *
 * @author Xiaoyu
 * @date 2020/6/14 - 10:26
 */
public class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(num<=k) {
                k-=num;
            }else {
                res = list.size()-i;
                break;
            }
        }
        return res;
    }

    public int findLeastNumOfUniqueInts1(int[] arr, int k) {
        int[] hash = new int[1000000001];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        Arrays.sort(hash);
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                if (hash[i] <= k) {
                    k -= hash[i];
                } else {
                    res++;
                }
            }
        }
        return res;
    }
}
