package com.xiaoxiao.minIncrementForUnique;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 * 返回使 A 中的每个值都是唯一的最少操作次数。
 * 示例 1:
 * 输入：[1,2,2]
 * 输出：1
 * 解释：经过一次 move 操作，数组将变为 [1, 2, 3]。
 * 示例 2:
 * 输入：[3,2,1,2,1,7]
 * 输出：6
 * 解释：经过 6 次 move 操作，数组将变为 [3, 4, 1, 2, 5, 7]。
 * 可以看出 5 次或 5 次以下的 move 操作是不能让数组的每个值唯一的。
 *
 * @author Xiaoyu
 * @date 2020/3/22 - 10:07
 */
public class Solution {

    //Map<Integer, Integer> hash = new HashMap<>();

    /**
     * 使用数组替换hashmap
     *
     * @param A
     * @return
     */
    public int minIncrementForUnique(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int[] hash = new int[50000];
        //计数增加次数
        int count = 0;
        //遍历数组,将数组放入hash表中
        for (int i = 0; i < A.length; i++) {
            hash[A[i]] += 1;
        }
        int check = 0;
        //需要减去的个数
        int abs = 0;
        //遍历hash 找出有多个数字的位置
        while (check < 50000) {
            //如果有多个数字
            if (hash[check] > 1) {
                //算出需要自增的数的个数
                abs = hash[check] - 1;
                count += abs;
                //将他们加一后,个数叠加到后一个数上
                hash[check + 1] += abs;
                hash[check] = 1;
            }
            check++;
        }
        return count;
    }
}
/**
 * 使用hashmap的方法,但是超时
 *
 * @param A
 * @return
 */
    /*public int minIncrementForUnique1(int[] A) {
        if(A.length ==0) {
            return 0;
        }
        int len = 0;
        for (int i = 0; i < A.length; i++) {
            int check = A[i];
            while (true) {
                if (hash.containsKey(check)) {
                    check++;
                    len++;
                } else {
                    hash.put(check, 1);
                    break;
                }
            }
        }
        return len;
    }*/

