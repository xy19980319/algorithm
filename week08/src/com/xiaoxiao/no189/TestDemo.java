package com.xiaoxiao.no189;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 15:57
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        int[] nums={-1};
        s.rotate(nums,2);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
