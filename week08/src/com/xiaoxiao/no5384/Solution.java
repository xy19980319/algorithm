package com.xiaoxiao.no5384;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/5/2 - 22:36
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max,candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies>=max) {
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}
