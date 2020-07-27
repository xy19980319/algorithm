package com.xiaoxiao.no1300转变数组后最接近目标值的数组和;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/14 - 12:06
 */
public class TestDemo {
    @Test
    public void test() {
        int[] arr = {1547,83230,57084,93444,70879};
        Solution s= new Solution();
        int bestValue = s.findBestValue(arr, 71237);
        System.out.println(bestValue);
    }
}
