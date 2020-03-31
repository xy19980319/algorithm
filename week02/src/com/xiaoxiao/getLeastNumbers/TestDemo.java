package com.xiaoxiao.getLeastNumbers;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/20 - 18:41
 */
public class TestDemo {
    @Test
    public void test() {
        int[] arr = {4,5,1,6,2,7,3,8};
        Solution s = new Solution();
        int[] leastNumbers = s.getLeastNumbers(arr, 4);
        for (int leastNumber : leastNumbers) {
            System.out.println(leastNumber);
        }
    }
}
