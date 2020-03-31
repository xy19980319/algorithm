package com.xiaoxiao.nextPermutation;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/21 - 15:00
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[] nums = {1,1,5,1,2,3,4 };
        s.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
