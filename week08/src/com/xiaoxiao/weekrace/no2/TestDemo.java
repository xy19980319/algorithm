package com.xiaoxiao.weekrace.no2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/26 - 10:30
 */
public class TestDemo {
    @Test
    public void test() {
        int[] cardPoints = {1,79,80,1,1,1,200,1};
        Solution s= new Solution();
        int j = s.maxScore(cardPoints, 3);
        System.out.println(j);
    }
}
