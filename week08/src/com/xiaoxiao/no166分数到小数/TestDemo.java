package com.xiaoxiao.no166分数到小数;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 13:08
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        String s1 = s.fractionToDecimal(1, 7);
        System.out.println(s1);
    }
}
